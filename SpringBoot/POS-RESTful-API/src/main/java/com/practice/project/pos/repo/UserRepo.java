package com.practice.project.pos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.project.pos.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

	public User findByName(String name);
}
