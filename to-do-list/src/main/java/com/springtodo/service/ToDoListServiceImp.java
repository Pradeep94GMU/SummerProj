package com.springtodo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtodo.model.ToDoList;
import com.springtodo.repository.ToDoRepository;


@Service
public class ToDoListServiceImp implements TodoListService{
	
	
	private final ToDoRepository todorepoObj;
	

	public ToDoListServiceImp(ToDoRepository todorepoObj) {
		super();
		this.todorepoObj = todorepoObj;
	}

	@Override
	public List<ToDoList> getAllTasks() {
		return todorepoObj.findAll();
	}

	@Override
	public ToDoList getTask(Long id) {
		Optional<ToDoList> SingleId = todorepoObj.findById(id);
		 return SingleId.orElse(null);
	}

	@Override
	public ToDoList createTask(ToDoList task) {
		todorepoObj.save(task);
		return task;
	}

	@Override
	public ToDoList updateTask(Long id, ToDoList task) {
		Optional<ToDoList> SingleId = todorepoObj.findById(id);
		if(!SingleId.isPresent()) {
			return null;
		}
		
		//find the particular task as object
		ToDoList toDoList = SingleId.get();
		
		//set with different value with all field
		toDoList.setTitle(task.getTitle());
		toDoList.setDescription(task.getDescription());
		toDoList.setPriority(task.getPriority());
		toDoList.setDueDate(task.getDueDate());
		
		return todorepoObj.save(toDoList);
	}

	@Override
	public void deleteTask(Long id) {
		if(todorepoObj.findById(id).isPresent()) {
			todorepoObj.deleteById(id);
		}
		
		
	}

}
