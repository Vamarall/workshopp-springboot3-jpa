package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Product;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.repositories.ProductRepository;
import com.educandoweb.course.repositories.UserRepository;

@Component
public class ProductService {

	@Autowired
	private ProductRepository repository; // Injeta automaticamente o repositório de usuários

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findByID(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get(); // Retorna o objeto(User) que esta dentro do optional
	}
}
