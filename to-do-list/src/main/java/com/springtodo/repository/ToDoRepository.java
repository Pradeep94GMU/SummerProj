package com.springtodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtodo.model.ToDoList;

public interface ToDoRepository extends JpaRepository<ToDoList, Long>{

}
