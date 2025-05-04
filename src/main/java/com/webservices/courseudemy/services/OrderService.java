package com.webservices.courseudemy.services;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.courseudemy.dto.OrderDTO;
import com.webservices.courseudemy.entities.Order;
import com.webservices.courseudemy.repositories.OrderRepository;

import jakarta.transaction.Transactional;


@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    
    @Transactional
    public List<OrderDTO> findAll() {
    	return repository.findAll().stream()
                .map(OrderDTO::fromEntity)
                .collect(Collectors.toList());
    }
    @Transactional
    public OrderDTO findById(Long id) {
        return repository.findById(id)
                .map(OrderDTO::fromEntity)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }
    
    // Método para carregar os itens explicitamente
    @Transactional
    public OrderDTO findByIdWithItems(Long id) {
        Order order = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Order not found"));
        
        Hibernate.initialize(order.getItems());
        order.getItems().forEach(item -> {
            Hibernate.initialize(item.getProduct());
            Hibernate.initialize(item.getProduct().getCategories());
        });
        
        return OrderDTO.fromEntity(order);
    }
}