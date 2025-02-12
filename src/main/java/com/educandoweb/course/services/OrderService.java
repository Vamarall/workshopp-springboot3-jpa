package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;

@Component
public class OrderService {
	
	@Autowired
	private OrderRepository repository;  // Injeta automaticamente o repositório de usuários
	
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findByID(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get(); //Retorna o objeto(User) que esta dentro do optional
	}
}
