package com.web.users.controller;

import com.web.users.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String show(Model model){

        String page = "user";
        /*Todo:
            - get list of teacher
         */
        model.addAttribute("page", page);
        return "admin/index";
    }

    @GetMapping("/users")
    public String getAllTeachers(){

        return "";
    }

}
