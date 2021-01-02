package com.cybertek.entity;

import com.cybertek.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "users")
public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phone;
    private boolean enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public User(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdateDateTime, Long lastUpdateUserId, String firstName, String lastName, String userName, String password, String phone, boolean enabled, Role role, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        username = userName;
        this.password = password;
        this.phone = phone;
        this.enabled = enabled;
        this.role = role;
        this.gender = gender;
    }
}
