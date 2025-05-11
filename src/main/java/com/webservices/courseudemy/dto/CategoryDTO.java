package com.webservices.courseudemy.dto;

import com.webservices.courseudemy.entities.Category;

public record CategoryDTO(
    Long id,
    String name
) {
    
    
    // Método de fábrica para conversão de entidade
    public static CategoryDTO fromEntity(Category category) {
        return new CategoryDTO(
            category.getIdLong(),
            category.getName()
        );
    }
}