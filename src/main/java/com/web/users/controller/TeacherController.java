package com.web.users.controller;

import com.web.users.service.TeacherService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/teacher")
    public String show(Model model){

        String page = "teacher";

        /*Todo:
            - get list of teacher
         */
        teacherService.getAllTeachers();


        model.addAttribute("page", page);
        return "admin/index";
    }

    @GetMapping("/teachers")
    public String getAllTeachers(){

        return "";
    }

}
