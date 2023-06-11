package com.springtodo.model;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "ToDoList")
public class ToDoList {
	
	@Id
    private Long id;

   
    private String title;

   
    private String description;
    
   
    private Integer priority; // Assuming priority is an integer. Adjust this as per your requirements

    private Date dueDate; // Assuming due date is of Date type. Adjust this as per your requirements

	public ToDoList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ToDoList(Long id, String title, String description, Integer priority, Date dueDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.dueDate = dueDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "ToDoList [id=" + id + ", title=" + title + ", description=" + description + ", priority=" + priority
				+ ", dueDate=" + dueDate + "]";
	}
    
	
	

}
