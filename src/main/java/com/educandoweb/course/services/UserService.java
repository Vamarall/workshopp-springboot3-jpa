package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Component
public class UserService {
	
	@Autowired
	private UserRepository repository;  // Injeta automaticamente o repositório de usuários
	
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findByID(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get(); //Retorna o objeto(User) que esta dentro do optional
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
