package com.deployment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deployment.models.Todos;


public interface TodosRepository extends JpaRepository<Todos, Long>{
	
}
