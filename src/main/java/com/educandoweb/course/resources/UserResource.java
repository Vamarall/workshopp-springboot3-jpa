package com.educandoweb.course.resources;
import com.educandoweb.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Classe disponibiliza um recurso web correspondente a entidade user

@RestController // Indica que esta classe é um controlador REST, permitindo o Spring gerenciar as requisições HTTP
@RequestMapping(value = "/users") // Define o caminho base do recurso como "/users"
public class UserResource {
	
	//O tipo "ResponseEntity" é um tipo especifico do spring para retornar respostas de requisicoes WEB
	@GetMapping //Indica que o metodo responde a requisiçao "GET" do http
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		
		return ResponseEntity.ok().body(u);
		
	}
	
	
	

}
