package com.webservices.courseudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.courseudemy.entities.OrderItem;
import com.webservices.courseudemy.entities.pk.OrderItemPK;
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
