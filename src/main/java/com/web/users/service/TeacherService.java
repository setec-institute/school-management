package com.web.users.service;

import com.web.users.dto.TeacherDto;
import com.web.users.dto.model.Teacher;
import com.web.users.modelbinding.TeacherBindingForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Getter@Setter
@Service
@Slf4j
public class TeacherService {

    public List<Teacher> getAllTeachers(){
        try {
            RestTemplate restTemplate = new RestTemplate();
            String uri = "http://192.168.152.133:5000/teachers";

            ResponseEntity<TeacherDto> responseEntity = restTemplate.getForEntity(uri, TeacherDto.class);
            if(responseEntity.getBody() != null){
                return responseEntity.getBody().getData();
            }
        }catch (Exception e){
            log.error("ERROR : " + e.getMessage());
        }
        return Collections.emptyList();
    }

    public String insertTeacher(TeacherBindingForm teacherBindingForm){

        String url = "http://192.168.152.133:5000";
        Teacher teacher = new Teacher();
        teacher = teacherBindingForm;

        TeacherDto teacherDto = new TeacherDto();
        List<Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher("",teacher.getTeacherName(),teacher.getGender(),
            teacher.getPob(),teacher.getDob(),teacher.getCurrentAddress(),teacher.getPhone(),
            teacher.getEmail(),teacher.getDegreeName(),teacher.getPhoto(),teacher.getStatus(),
            teacher.getCreatedBy(),teacher.getCreatedDate(),teacher.getUpdatedBy(),teacher.getUpdatedDate()));

        teacherDto.setCode("000");
        teacherDto.setData(teachers);
        teacherDto.setMessage("OK");




        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> teacherMap = new HashMap<>();
        teacherMap.put("teacher_name",teacher.getTeacherName());

        return "Success";
    }

}
