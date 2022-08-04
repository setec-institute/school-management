package com.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {

    @JsonProperty("CODE")
    private String code;
//    private Teacher data;
    @JsonProperty("MESSAGE")
    private String message;


}
