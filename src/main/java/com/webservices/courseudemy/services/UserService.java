package com.webservices.courseudemy.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.webservices.courseudemy.dto.UserDTO;
import com.webservices.courseudemy.entities.User;
import com.webservices.courseudemy.repositories.UserRepository;
import com.webservices.courseudemy.services.exceptions.DatabaseException;
import com.webservices.courseudemy.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User>findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete (Long id) {
		try {
			repository.deleteById(id);
			
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
		
	}
	public User update(Long id, UserDTO dto) {
		try {
			User entity = repository.findById(id).orElseThrow();;
			updateData(entity, dto);
			return repository.save(entity);
		} catch (NoSuchElementException e) {

			throw new ResourceNotFoundException(id);

		}
		}


	private void updateData(User entity, UserDTO dto) {
	    entity.setName(dto.name());
	    entity.setEmail(dto.email());
	    entity.setPhone(dto.phone());
	    entity.setPassword(dto.password());
	}
}
