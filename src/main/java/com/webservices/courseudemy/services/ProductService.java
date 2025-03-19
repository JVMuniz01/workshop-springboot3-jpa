package com.webservices.courseudemy.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.courseudemy.dto.CategoryDTO;
import com.webservices.courseudemy.dto.ProductDTO;
import com.webservices.courseudemy.entities.Product;
import com.webservices.courseudemy.repositories.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	@Transactional
	public List<ProductDTO>findAll(){
		List<Product> products = repository.findAll();
		return products.stream().map(this::convertToProductDTO).collect(Collectors.toList());
	}
	
	@Transactional
	public ProductDTO findById(Long id){
		Optional<Product> obj = repository.findById(id);
		Product product = obj.orElseThrow(() -> new RuntimeException("Product not found"));    
		return convertToProductDTO(product);
}
	
	private ProductDTO convertToProductDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getname());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setImgUrl(product.getImgUrl());
        
        Set<CategoryDTO> categoryDTOs = product.getCategories().stream().map(category -> {
        	CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(category.getIdLong());
            categoryDTO.setName(category.getName());
            return categoryDTO;
        })
        .collect(Collectors.toSet());
        productDTO.setCategories(categoryDTOs);
        return productDTO;
}
	
}

