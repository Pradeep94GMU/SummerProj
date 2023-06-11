package com.springtodo.service;

import java.util.List;

import com.springtodo.model.ToDoList;

public interface TodoListService {
	//it will only contain the methods 
	
	List<ToDoList> getAllTasks();
	ToDoList getTask(Long id);
	ToDoList createTask(ToDoList task);
	ToDoList updateTask(Long id, ToDoList task);
    void deleteTask(Long id);

}
