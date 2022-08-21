package com.web.users.modelbinding;

import com.web.users.dto.model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeacherBindingForm extends Teacher {

    private String firstname;
    private String lastname;

}
