package com.webservices.courseudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.courseudemy.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
}
