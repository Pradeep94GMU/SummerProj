package com.employeeManagment.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeManagment.model.Employee;
import com.employeeManagment.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	private EmployeeService emplObj;
	
	
	
	public EmployeeController(EmployeeService emplObj) {
		super();
		this.emplObj = emplObj;
	}

	@RequestMapping("/home")
	public String demo() {
		return "THis is my webpage";
	}
	
	@GetMapping("/detail")
	public List<Employee> getAllEmpl(){
		return this.emplObj.getAllEmployee();
	}
	
	//get single employee data
	@GetMapping("/detail/{id}")
	public Employee getSingleEmpl(@PathVariable int id) {
		return emplObj.getSingleEmpl(id);
	}
	
	@PostMapping("/detail")
	public Employee AddEmpl(@RequestBody Employee emp) {
		return emplObj.addEmpl(emp);
	}
	
	//update employee data
	@PutMapping("/detail")
	public Employee updateData(@RequestBody Employee emp) {
		return emplObj.updateEmpl(emp);
		
	}
	
	//delete an employee data
	@DeleteMapping("detail/{id}")
	public void delete(@PathVariable int id) {
		emplObj.deleteEmp(id);
	}

}
