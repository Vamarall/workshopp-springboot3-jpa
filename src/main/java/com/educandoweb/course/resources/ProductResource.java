package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.CategoryService;
import com.educandoweb.course.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Classe disponibiliza um recurso web correspondente a entidade products

@RestController // Indica que esta classe é um controlador REST, permitindo o Spring gerenciar
				// as requisições HTTP
@RequestMapping(value = "/products") // Define o caminho base do recurso como "/products"
public class ProductResource {

	@Autowired
	private ProductService service;

	// O tipo "ResponseEntity" é um tipo especifico do spring para retornar
	// respostas de requisicoes WEB
	@GetMapping // Indica que o metodo responde a requisiçao "GET" do http
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();

		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}") // indica que a requisicao vai aceitar um id dentro da URL
	public ResponseEntity<Product> finfById(@PathVariable Long id) {
		Product category = service.findByID(id);

		return ResponseEntity.ok().body(category);
	}

}
