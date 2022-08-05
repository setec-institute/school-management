package com.web.users.controller;

import com.web.users.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {


    @GetMapping("/student")
    public String show(Model model){

        String page = "student";
        /*Todo:
            - get list of teacher
         */

        model.addAttribute("page", page);
        return "admin/index";
    }

    @GetMapping("/students")
    public String getAllTeachers(){

        return "";
    }

}
