package com.spring.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.model.User;
import com.spring.project.repository.UserRepository;
import com.spring.project.service.UserServices;

@Service
public class UserServiceImpl implements UserServices {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
			
	}

	@Override
	public User featchUserByEmail(String email) {
		return userRepository.findByEmailId(email);
	}

}
