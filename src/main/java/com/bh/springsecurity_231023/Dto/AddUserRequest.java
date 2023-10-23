package com.bh.springsecurity_231023.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AddUserRequest {
    private String email;
    private String password;
    private LocalDateTime birth;
    private LocalDateTime registerDate;
    private Integer roleId;
}
