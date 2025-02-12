package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Order;

import com.educandoweb.course.services.OrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Classe disponibiliza um recurso web correspondente a entidade order

@RestController // Indica que esta classe é um controlador REST, permitindo o Spring gerenciar
				// as requisições HTTP
@RequestMapping(value = "/orders") // Define o caminho base do recurso como "/orders"
public class OrderResource {

	@Autowired
	private OrderService service;

	// O tipo "ResponseEntity" é um tipo especifico do spring para retornar
	// respostas de requisicoes WEB
	@GetMapping // Indica que o metodo responde a requisiçao "GET" do http
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();

		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}") // indica que a requisicao vai aceitar um id dentro da URL
	public ResponseEntity<Order> finfById(@PathVariable Long id) {
		Order order = service.findByID(id);

		return ResponseEntity.ok().body(order);
	}

}
