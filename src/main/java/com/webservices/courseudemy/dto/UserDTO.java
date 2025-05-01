package com.webservices.courseudemy.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.webservices.courseudemy.entities.User;

public record UserDTO(Long id,
		String name,
		String email,
		String phone,
		String password,
		List <OrderDTO>orders) {
	
	public static UserDTO fromEntity(User user) {
		return new UserDTO(
				user.getId(), user.getName(), user.getEmail(), user.getPhone(), user.getPassword(), user.getOrders().stream()
                .map(OrderDTO::fromEntity)
                .collect(Collectors.toList())
				);
	}

}
