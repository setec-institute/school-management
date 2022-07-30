package com.web.controller;

import com.web.dto.TeacherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class SchoolController {

    private RestTemplate restTemplate;

    @Autowired
//    public SchoolController(RestTemplate restTemplate){
//        this.restTemplate = restTemplate;
//    }



    @GetMapping("/admin")
    public String index(){

        RestTemplate restTemplate = new RestTemplate();

        var url = "http://192.168.76.133:5000/allTeacher";


        ResponseEntity<TeacherDto> responseEntity = restTemplate.getForEntity(url, TeacherDto.class);
        responseEntity.getBody();
        
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
