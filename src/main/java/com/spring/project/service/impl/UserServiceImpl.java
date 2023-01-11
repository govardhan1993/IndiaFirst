package com.spring.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.project.model.User;
import com.spring.project.repository.UserRepository;
import com.spring.project.service.UserServices;

public class UserServiceImpl implements UserServices {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
			
	}

}
