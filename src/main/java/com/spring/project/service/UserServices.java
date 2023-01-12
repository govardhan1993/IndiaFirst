package com.spring.project.service;

import org.springframework.stereotype.Service;

import com.spring.project.dto.UserRegistrationDto;
import com.spring.project.model.User;
@Service
public interface UserServices {
	
	public User saveUser(UserRegistrationDto userRegistrationDto);
	


}
