package com.example.loginregistrationspringbootthymeleaf.service;

import com.example.loginregistrationspringbootthymeleaf.model.User;
import com.example.loginregistrationspringbootthymeleaf.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);

}
