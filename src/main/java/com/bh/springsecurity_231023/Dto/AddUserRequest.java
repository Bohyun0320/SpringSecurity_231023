package com.bh.springsecurity_231023.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class AddUserRequest {
    private String email;
    private String password;
    private LocalDate birth;
    private LocalDateTime registerDate;
    private Integer roleId;
}
