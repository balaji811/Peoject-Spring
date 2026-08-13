package com.example.projectSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectSpring.model.Employee;
import com.example.projectSpring.repository.EmployeeRepository;

@Service
public class ProfileService {
   
	@Autowired
	private EmployeeRepository employeeRepository;
	
	 public Employee profile(String email) {
		   
		 Employee e=  employeeRepository.findbyEmail(email);
		   
		   return e;
	 }
	
}
