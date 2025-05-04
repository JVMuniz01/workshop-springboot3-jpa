package com.webservices.courseudemy.dto;

import com.webservices.courseudemy.entities.Product;

public record ProductBasicDTO(
	    Long id,
	    String name,
	    String description,
	    Double price,
	    String imgUrl
	) {
	public static ProductBasicDTO fromEntity(Product product) {
        return new ProductBasicDTO(
            product.getId(),
            product.getname(),
            product.getDescription(),
            product.getPrice(),
            product.getImgUrl()
        );
    }
	}
