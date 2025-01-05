package com.webservices.courseudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.courseudemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
