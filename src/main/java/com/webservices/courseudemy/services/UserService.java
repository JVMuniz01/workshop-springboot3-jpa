package com.webservices.courseudemy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.courseudemy.dto.UserDTO;
import com.webservices.courseudemy.entities.User;
import com.webservices.courseudemy.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User>findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete (Long id) {
		repository.deleteById(id);
		
	}
	public User update(Long id, UserDTO dto) {
		User entity = repository.findById(id).orElseThrow();;
		updateData(entity, dto);
		return repository.save(entity);
		}


	private void updateData(User entity, UserDTO dto) {
	    entity.setName(dto.name());
	    entity.setEmail(dto.email());
	    entity.setPhone(dto.phone());
	    entity.setPassword(dto.password());
	}
}
