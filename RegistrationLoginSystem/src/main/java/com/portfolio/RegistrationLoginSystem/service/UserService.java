package com.portfolio.RegistrationLoginSystem.service;

import com.portfolio.RegistrationLoginSystem.model.User;
import com.portfolio.RegistrationLoginSystem.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{

    User save(UserRegistrationDto registrationDto);
}
