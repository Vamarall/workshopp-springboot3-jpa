package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	// Não é necessário declarar métodos básicos como findAll() ou findById(),
	// pois o JpaRepository já fornece essas implementações automaticamente.

}
