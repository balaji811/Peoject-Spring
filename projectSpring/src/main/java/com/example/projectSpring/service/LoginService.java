package com.example.projectSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.projectSpring.model.Employee;
import com.example.projectSpring.repository.EmployeeRepository;

@Service
public class LoginService {
   
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee login(Employee employee) {
		
		String email = employee.getEmail();
		String password = employee.getPassword();
		 
		Employee e = employeeRepository.findByEmailPassword(email,password);
		
		return e;
	}
}
