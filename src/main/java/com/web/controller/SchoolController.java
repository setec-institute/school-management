package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/tables")
    public String schedulePage(){
        return "tableSchedule";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/schedule")
    public String calendarPage(){
        return "tableSchedule";
    }



}
