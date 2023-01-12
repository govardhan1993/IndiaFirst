package com.spring.project.service.impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.dto.UserRegistrationDto;
import com.spring.project.model.Role;
import com.spring.project.model.User;
import com.spring.project.repository.UserRepository;
import com.spring.project.service.UserServices;

@Service
public class UserServiceImpl implements UserServices {
	@Autowired
	private UserRepository userRepository;
	
	

	@Override
	public User saveUser(UserRegistrationDto userRegistrationDto) {
		
		User users= new User(userRegistrationDto.getFirstname(), userRegistrationDto.getLastname(),userRegistrationDto.getUsername(),userRegistrationDto.getPassword()
				,userRegistrationDto.getEmail(),userRegistrationDto.getMobile(), Arrays.asList(new Role("ADMIN")));
		
		return userRepository.save(users);
		
	}

	

}
