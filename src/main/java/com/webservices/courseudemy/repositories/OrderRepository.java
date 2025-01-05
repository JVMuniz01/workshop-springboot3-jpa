package com.webservices.courseudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.courseudemy.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
