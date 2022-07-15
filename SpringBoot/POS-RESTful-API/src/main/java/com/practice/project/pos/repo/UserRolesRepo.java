package com.practice.project.pos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.project.pos.entity.UserRoles;

public interface UserRolesRepo extends JpaRepository<UserRoles, Long> {

}
