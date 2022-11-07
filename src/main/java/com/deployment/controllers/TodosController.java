package com.deployment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deployment.models.Todos;
import com.deployment.repositories.TodosRepository;

@RestController
@RequestMapping("/api/")
public class TodosController {
	@Autowired
	private TodosRepository todosRepository;
	
	@GetMapping("/todos")
	public List<Todos> getAllTodos(){
		List<Todos> todos = todosRepository.findAll();
		return todos;
	}
}
