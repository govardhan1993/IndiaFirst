package com.spring.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.model.User;
import com.spring.project.service.UserServices;

@RestController
@RequestMapping("/user")
public class RegistrationController {
	@Autowired
	private UserServices userServices;
	
	@PostMapping("/save")
	public ResponseEntity<User> createUser(@RequestBody User user) throws Exception {
		User users = userServices.saveUser(user);
		return ResponseEntity.ok().body(users);
	}

}
