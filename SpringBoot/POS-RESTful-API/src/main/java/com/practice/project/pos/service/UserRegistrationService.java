package com.practice.project.pos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.project.pos.entity.User;
import com.practice.project.pos.repo.UserRepo;

@Service
public class UserRegistrationService {

	@Autowired
	private UserRepo userRepo;
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	public User fetchUserByUserName(String userName) {
		return userRepo.findByName(userName);
	}
}
