package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Category;

import com.educandoweb.course.services.CategoryService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Classe disponibiliza um recurso web correspondente a entidade category

@RestController // Indica que esta classe é um controlador REST, permitindo o Spring gerenciar
				// as requisições HTTP
@RequestMapping(value = "/categories") // Define o caminho base do recurso como "/categories"
public class CategoryResource {

	@Autowired
	private CategoryService service;

	// O tipo "ResponseEntity" é um tipo especifico do spring para retornar
	// respostas de requisicoes WEB
	@GetMapping // Indica que o metodo responde a requisiçao "GET" do http
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();

		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}") // indica que a requisicao vai aceitar um id dentro da URL 
	public ResponseEntity<Category> finfById(@PathVariable Long id) {
		Category category = service.findByID(id);
		
		return ResponseEntity.ok().body(category);
	}
	

}
