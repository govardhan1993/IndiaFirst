package com.spring.project.service;

import org.springframework.stereotype.Service;

import com.spring.project.model.User;
@Service
public interface UserServices {
	
	public User saveUser(User user);
	
	public User featchUserByEmail(String email);

}
