package com.employeeManagment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String department;
	private String Salary;
	private int age;
	
	
	public Employee() {

	}
	public Employee(int id, String name, String department, String salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		Salary = salary;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", Salary=" + Salary + ", age="
				+ age + "]";
	}
	
	
	
	

}
