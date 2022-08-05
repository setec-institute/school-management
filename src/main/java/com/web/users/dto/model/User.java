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
public class User {

    @JsonProperty("u_id")
    private Integer userId;
    private String username;
    @JsonProperty("u_password")
    private String password;
    @JsonProperty("u_desc")
    private String userDesc;
    private String pob;
    private String dob;
    @JsonProperty("current_address")
    private String currentAddress;
    private String phone;
    private String email;
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