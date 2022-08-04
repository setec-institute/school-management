package com.web.controller;

import com.web.users.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SchoolController {

    @GetMapping("/admin")
    public String index(Model model){
        Boolean pageName = true;
        model.addAttribute("pageName", pageName);
        return "admin/index";
    }

    @GetMapping("/tables")
    public String schedulePage(){
        return "tableSchedule";
    }

    @GetMapping("/login")
    public String loginPage(Model model){

        User user = new User();
        model.addAttribute("user", user);

        return "admin/login";
    }
    @PostMapping("/login")
    public String showPage(@ModelAttribute("user") User user){

        String username = user.getUsername();
        String password = user.getPassword();

        System.out.println(username.getClass().getName());
        System.out.println(password.getClass().getName());

        if ("bunhor".equals(username)){
            return "redirect:admin";
        }else {
            return "error";
        }
    }

    @GetMapping("/schedule")
    public String calendarPage(){
        return "tableSchedule";
    }


}
