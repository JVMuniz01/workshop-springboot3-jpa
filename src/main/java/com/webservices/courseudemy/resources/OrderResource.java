package com.webservices.courseudemy.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.courseudemy.dto.OrderDTO;
import com.webservices.courseudemy.entities.Order;
import com.webservices.courseudemy.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = service.findByIdWithItems(id);
        return ResponseEntity.ok(obj);
    }
}