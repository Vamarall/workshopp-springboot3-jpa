package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;


//Interface de repositório para a entidade Order
//Estende JpaRepository, que fornece métodos padrão para operações CRUD
public interface OrderRepository extends JpaRepository<Order, Long> {

	// Não é necessário declarar métodos básicos como findAll() ou findById(),
	// pois o JpaRepository já fornece essas implementações automaticamente.

}
