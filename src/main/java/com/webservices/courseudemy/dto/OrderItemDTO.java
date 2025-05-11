package com.webservices.courseudemy.dto;



import com.webservices.courseudemy.entities.OrderItem;

public record OrderItemDTO(
	    Integer quantity,
	    Double price,
	    Double subTotal,
	    ProductBasicDTO product
	) {
	    public static OrderItemDTO fromEntity(OrderItem item) {
	        return new OrderItemDTO(
	            item.getQuantity(),
	            item.getPrice(),
	            item.getSubTotal(),
	            ProductBasicDTO.fromEntity(item.getProduct())
 
	        );
	    }
	}