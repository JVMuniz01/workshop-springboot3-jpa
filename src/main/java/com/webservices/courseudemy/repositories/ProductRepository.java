package com.webservices.courseudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.courseudemy.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
