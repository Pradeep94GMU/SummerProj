package com.springtodo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PostExchange;

import com.springtodo.model.ToDoList;
import com.springtodo.service.TodoListService;

@RestController
public class ToDoController {
	
	@Autowired
	private final TodoListService todolistServObj;
	
	
	
	public ToDoController(TodoListService todolistServObj) {
		super();
		this.todolistServObj = todolistServObj;
	}




	@GetMapping("/home")
	public String home() {
		return "Hello welcome";
	}
	
	//get all the detail
	@GetMapping("/todo")
	public List<ToDoList> getAllTasks(){
		return todolistServObj.getAllTasks();
	}
	
	//get single Id information
	
	@GetMapping("/todo/{id}")
	public ToDoList getTask(@PathVariable Long id) { 
		return todolistServObj.getTask(id);
	}
	
	
	//to create a to do list
	@PostMapping("/todo")
	public ToDoList createTask(@RequestBody ToDoList task) {
		return todolistServObj.createTask(task);
	}
	
	
	//to update the list with new data
	@PutMapping("/todo/{id}")
	public ToDoList updateTask(@PathVariable Long id, @RequestBody ToDoList task) {
		return todolistServObj.updateTask(id, task);
	}
	
	
	//to delete any list
	@DeleteMapping("/todo/{id}")
	public void deleteTask(@PathVariable Long id) {
		todolistServObj.deleteTask(id);
	}
	
	

}
