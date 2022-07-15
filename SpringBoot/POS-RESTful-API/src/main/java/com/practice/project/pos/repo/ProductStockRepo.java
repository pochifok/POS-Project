package com.practice.project.pos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.project.pos.entity.ProductStock;

public interface ProductStockRepo extends JpaRepository<ProductStock, Long> {

}
