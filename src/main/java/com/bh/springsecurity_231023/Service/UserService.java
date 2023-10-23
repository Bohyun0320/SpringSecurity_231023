package com.bh.springsecurity_231023.Service;

import com.bh.springsecurity_231023.Domain.User;
import com.bh.springsecurity_231023.Dto.AddUserRequest;
import com.bh.springsecurity_231023.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Integer save(AddUserRequest dto){
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .birth(dto.getBirth())
                .registerDate(dto.getRegisterDate())
                .roleId(1)
                .build()).getUserId();
    }
}
