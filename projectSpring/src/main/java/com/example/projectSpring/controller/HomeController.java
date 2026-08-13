package com.example.projectSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectSpring.model.Employee;
import com.example.projectSpring.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;
    
	@GetMapping("/home")
	public String home() {
		 return "hello to the project";
	}
	
	@PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
		   
		  
		Employee e = employeeService.createEmployee(employee);
		
		return ResponseEntity.ok(e);
		
	}
	
	
	
}
