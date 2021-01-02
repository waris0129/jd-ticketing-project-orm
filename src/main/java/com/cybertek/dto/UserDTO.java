package com.cybertek.dto;

import com.cybertek.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phone;
    private boolean enabled;
    private RoleDTO role;
    private Gender gender;

}
