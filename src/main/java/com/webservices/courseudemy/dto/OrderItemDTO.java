package com.webservices.courseudemy.dto;



import com.webservices.courseudemy.entities.OrderItem;
import com.webservices.courseudemy.entities.Product;

public record OrderItemDTO(
	    Integer quantity,
	    Double price,
	    Double subTotal,
	    ProductBasicDTO product
	) {
	    public static OrderItemDTO fromEntity(OrderItem item) {
	        Product product = item.getProduct(); 
	        return new OrderItemDTO(
	            item.getQuantity(),
	            item.getPrice(),
	            item.getSubTotal(),
	            new ProductBasicDTO(
	                product.getId(),
	                product.getname(),
	                product.getDescription(),
	                product.getPrice(),
	                product.getImgUrl()
	            )
	        );
	    }
	}