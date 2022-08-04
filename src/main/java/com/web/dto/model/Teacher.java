package com.web.dto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    private Integer teachersId;
    private String teacherName;
    private String gender;
    private String pob;
    private String dob;
    private String currentAddress;
    private String phone;
    private String email;
    private String teacherDegreeName;
    private String photo;
    private String status;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;

}