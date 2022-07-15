package com.practice.project.pos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.project.pos.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
