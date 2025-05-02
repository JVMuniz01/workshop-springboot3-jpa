package com.webservices.courseudemy.dto;

import java.util.Set;
import java.util.stream.Collectors;

import com.webservices.courseudemy.entities.Product;

public record ProductDTO(Long id,
	    String name,
	    String description,
	    Double price,
	    String imgUrl,
	    Set<CategoryDTO> categories){
	
	public static ProductDTO fromEntity(Product product) {
        return new ProductDTO(
            product.getId(),
            product.getname(),
            product.getDescription(),
            product.getPrice(),
            product.getImgUrl(),
            // Assumindo que CategoryDTO também tem um fromEntity
            product.getCategories().stream()
                .map(CategoryDTO::fromEntity)
                .collect(Collectors.toSet())
        );
    }
}
