package com.web;

import com.web.dto.Post;
import com.web.dto.TeacherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Objects;

@Component
public class DemoRest {

    private RestTemplate restTemplate;

    @Autowired
    public DemoRest(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }


//    @PostConstruct
//    public void getAllPost(){
//        RestTemplate restTemplate = new RestTemplate();
//
//        var url = "https://jsonplaceholder.typicode.com/posts/1";
//
//        ResponseEntity<Post> responseEntity = restTemplate.getForEntity(url, Post.class);
//
//        if(responseEntity.getStatusCodeValue() == 200){
//            System.out.println("Response : " + responseEntity.getStatusCodeValue());
//
//            Post postDto = new Post();
//
//            postDto.setBody(Objects.requireNonNull(responseEntity.getBody()).getBody());
//            postDto.setId(responseEntity.getBody().getId());
//            postDto.setTitle(responseEntity.getBody().getTitle());
//            postDto.setUserId(responseEntity.getBody().getUserId());
//
//            System.out.println("Post : " + postDto.getTitle());
//        }
//        responseEntity.getBody();
//
//
//    }



    @PostConstruct
    public void consumeFromPython(){

        RestTemplate restTemplate = new RestTemplate();

        var url = "http://localhost:5000/allTeacher";

        ResponseEntity<TeacherDto> responseEntity = restTemplate.getForEntity(url, TeacherDto.class);
        responseEntity.getBody();








        if(responseEntity.getStatusCodeValue() == 200){
            System.out.println("Response : " + responseEntity.getStatusCodeValue());
            TeacherDto t = new TeacherDto();
            t.setCode(Objects.requireNonNull(responseEntity.getBody()).getCode());
            t.setMessage(responseEntity.getBody().getMessage());
            System.out.println("teacher : " + t.getCode());
        }

    }

}
