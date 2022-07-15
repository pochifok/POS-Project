package com.practice.project.pos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.project.pos.entity.Sales;

public interface SalesRepo extends JpaRepository<Sales, Long> {

}
