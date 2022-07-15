package com.practice.project.pos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.project.pos.entity.UserRolesPermissions;

public interface UserRolesPermissionsRepo extends JpaRepository<UserRolesPermissions, Long> {

}
