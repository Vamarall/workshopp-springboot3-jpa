package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.repositories.UserRepository;

@Component
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;  // Injeta automaticamente o repositório de usuários
	
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findByID(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get(); //Retorna o objeto(User) que esta dentro do optional
	}
}
