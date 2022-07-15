package com.practice.project.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.project.pos.entity.User;
import com.practice.project.pos.service.UserRegistrationService;

@RestController
public class UserRegistrationController {
	
	@Autowired
	private UserRegistrationService userRegService;
	
	
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempUserId = user.getName();
		if(tempUserId != null && !"".equals(tempUserId)) {
			User userobj = userRegService.fetchUserByUserName(tempUserId);
			if(userobj != null) {
				throw new Exception("user id "+ tempUserId +" is already exist");
			}
		}
		
		User userObj = null;
		userRegService.saveUser(user);
		return userObj;
	}
	

}
