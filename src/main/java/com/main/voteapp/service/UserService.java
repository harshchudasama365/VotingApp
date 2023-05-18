package com.main.voteapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.main.voteapp.model.User;
import com.main.voteapp.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
