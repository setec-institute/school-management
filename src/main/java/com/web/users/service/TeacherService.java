package com.web.users.service;

import com.web.users.dto.TeacherDto;
import com.web.users.dto.model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Getter@Setter
@Service
public class TeacherService {

    public List<Teacher> getAllTeachers(){
//        RestTemplate restTemplate = new RestTemplate();
//
//        String uri = "http://127.0.0.1:5000/allTeacher";
//
//        ResponseEntity<TeacherDto> responseEntity = restTemplate.getForEntity(uri, TeacherDto.class);
//        responseEntity.getBody();

        return new ArrayList<>();
    }

}
