package com.employeeManagment.service;

import java.util.List;

import com.employeeManagment.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	Employee getSingleEmpl(int id);
	Employee addEmpl(Employee emp);
	Employee updateEmpl(Employee emp);
	void deleteEmp(int id);
	
	
	
}
