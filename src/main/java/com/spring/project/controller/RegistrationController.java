package com.spring.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.exception.UserAlredyFoundException;
import com.spring.project.model.User;
import com.spring.project.service.UserServices;

@RestController
@RequestMapping("/user")
public class RegistrationController {
	@Autowired
	private UserServices userServices;
	
	@PostMapping("/save")
	public User createUser(@RequestBody User user) throws Exception {
		
		String tempEmailId=user.getEmail();
		if(tempEmailId!=null && !"".equals(tempEmailId)) {
		User users=	userServices.featchUserByEmail(tempEmailId);
		if(users!=null)
		{
			throw new UserAlredyFoundException("User With this id "+tempEmailId+"is alredy exits");
		}
		}
		User users=null;
		users = userServices.saveUser(user);
		return users;
	}

}
