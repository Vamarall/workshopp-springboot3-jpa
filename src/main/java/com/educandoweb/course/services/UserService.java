package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;

@Component
public class UserService {

	@Autowired
	private UserRepository repository; // Injeta automaticamente o repositório de usuários

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findByID(Long id) {
		Optional<User> obj = repository.findById(id);
		// O metodo orElseThrow vai tentar dar o get se nao tiver usuario com o id
		// passado como parametro vai lançar uma excecao(ResourceNotFoundException)
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setEmail(obj.getEmail());
		entity.setName(obj.getName());
		entity.setPhone(obj.getPhone());

	}
}
