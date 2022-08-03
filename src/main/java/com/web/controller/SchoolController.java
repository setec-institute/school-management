package com.web.controller;

import com.web.dto.TeacherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class SchoolController {




    @GetMapping("/admin")
    public String index(){


        
        return "admin/index";
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
