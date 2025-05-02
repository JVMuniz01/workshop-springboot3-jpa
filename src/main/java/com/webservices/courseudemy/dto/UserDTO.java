package com.webservices.courseudemy.dto;

import com.webservices.courseudemy.entities.User;

public record UserDTO(Long id,
		String name,
		String email,
		String phone,
		String password) {
	
	public static UserDTO fromEntity(User user) {
		return new UserDTO(
				user.getId(), user.getName(), user.getEmail(), user.getPhone(), user.getPassword()
				
				);
	}

}
