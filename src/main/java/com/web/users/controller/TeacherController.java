package com.web.users.controller;

import com.web.users.dto.model.Teacher;
import com.web.users.modelbinding.TeacherBindingForm;
import com.web.users.service.TeacherService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/teachers")
    public String show(Model model){
        String page = "teacher";
        List<Teacher> teachers = teacherService.getAllTeachers();
        if (!teachers.isEmpty()){
            model.addAttribute("page", page);
            model.addAttribute("teachers", teachers);
            return "admin/index";
        }
        return "error";
    }


    @GetMapping("/add-teacher")
    public String addTeacher(Model model){

        TeacherBindingForm teacherBindingForm = new TeacherBindingForm();
        String page = "addTeacher";
        /*Todo:
            - get list of teacher
         */
        model.addAttribute("page", page);
        model.addAttribute("teacherBindingForm", teacherBindingForm);
        return "admin/index";
    }

    @PostMapping("/add-teacher/process")
    public String addTeacherProcess(@ModelAttribute(value="teacherBindingForm") TeacherBindingForm teacherBindingForm){

        String page = "addTeacher";
        String result = teacherService.insertTeacher(teacherBindingForm);

        if (result.equals("Success")){
            return "redirect:/add-teacher";
        }
        return "error";
    }

//    @GetMapping("")
//    public String getAllTeachers(){
//
//        return "";
//    }

}
