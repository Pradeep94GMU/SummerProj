package com.employeeManagment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeManagment.Dao.EmployeDao;
import com.employeeManagment.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeDao emplDao;


	public EmployeeServiceImpl(EmployeDao emplDao) {
		super();
		this.emplDao = emplDao;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return emplDao.findAll();
		
	}

	@Override
	public Employee addEmpl(Employee emp) {
		emplDao.save(emp);
		return emp;
	}

	@Override
	public Employee getSingleEmpl(int id) {
		Optional<Employee> employee = this.emplDao.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
		}
		else {
			throw new RuntimeException("Employee not found for id: " + id);
		}
		

	}

	@Override
	public Employee updateEmpl(Employee emp) {
		emplDao.save(emp);
		return emp;
	}

	@Override
	public void deleteEmp(int id) {
		//first find the empId
		Optional<Employee> employee = emplDao.findById(id);
		
		if(employee.isPresent()) {
			emplDao.delete(employee.get());
		}
		else
		{
			throw new RuntimeException("Employee not found for id: " + id);
		}
		
	}


}
