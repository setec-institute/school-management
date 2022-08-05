package com.web.users.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.web.users.dto.model.Teacher;
import com.web.users.dto.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @JsonProperty("code")
    private String code;
    @JsonProperty("data")
    private List<User> data;
    @JsonProperty("message")
    private String message;


}
