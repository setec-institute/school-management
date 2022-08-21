package com.web.users.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    @JsonProperty("teacher_id")
    private String teacherId;
    @JsonProperty("teacher_name")
    private String teacherName;
    private String gender;
    private String pob;
    private String dob;
    @JsonProperty("current_address")
    private String currentAddress;
    private String phone;
    private String email;
    @JsonProperty("degree_name")
    private String degreeName;
    private String photo;
    private String status;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("create_date")
    private Date createdDate;
    @JsonProperty("updated_by")
    private String updatedBy;
    @JsonProperty("updated_date")
    private Date updatedDate;

}