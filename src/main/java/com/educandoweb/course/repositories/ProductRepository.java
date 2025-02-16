package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {

	// Não é necessário declarar métodos básicos como findAll() ou findById(),
	// pois o JpaRepository já fornece essas implementações automaticamente.

}
