package com.webservices.courseudemy.dto;


import java.util.stream.Collectors;

import com.webservices.courseudemy.entities.OrderItem;
import com.webservices.courseudemy.entities.Product;

public record OrderItemDTO(
	    Integer quantity,
	    Double price,
	    Double subTotal,
	    ProductDTO product
	) {
	    public static OrderItemDTO fromEntity(OrderItem item) {
	        Product product = item.getProduct(); 
	        return new OrderItemDTO(
	            item.getQuantity(),
	            item.getPrice(),
	            item.getSubTotal(),
	            new ProductDTO(
	                product.getId(),
	                product.getname(),
	                product.getDescription(),
	                product.getPrice(),
	                product.getImgUrl(),
	                product.getCategories().stream()
	                    .map(category -> new CategoryDTO(category.getIdLong(), category.getName()))
	                    .collect(Collectors.toSet())
	            )
	        );
	    }
	}