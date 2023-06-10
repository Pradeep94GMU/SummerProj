package com.employeeManagment.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeManagment.model.Employee;

public interface EmployeDao extends JpaRepository<Employee, Integer>{

}
