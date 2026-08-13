package com.example.projectSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectSpring.model.Employee;
import com.example.projectSpring.repository.EmployeeRepository;

@Service
public class EmployeeService {
 
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public Employee createEmployee(Employee e) {
		 
		Employee e1 = employeeRepository.save(e);
		
		return e1;
	}
	
	
	
	
	
}
