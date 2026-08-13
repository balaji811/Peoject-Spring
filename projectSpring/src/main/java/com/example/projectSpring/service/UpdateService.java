package com.example.projectSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectSpring.model.Employee;
import com.example.projectSpring.repository.EmployeeRepository;

@Service
public class UpdateService {
  
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee uProfile(String email) {
		 Employee e =employeeRepository.findbyEmail(email);
		 
		 return e;
	}
	
	
	public boolean updateProfile(String eamil,Employee e) {
		 
		    Employee employee= employeeRepository.findbyEmail(eamil);
		    
		       employee.setDept(e.getDept());
		       employee.setEmail(e.getEmail());
		       employee.setPassword(e.getPassword());
		       employee.setName(e.getName());
		       
		       Employee e1 = employeeRepository.save(employee);
		       
		       if(e1 != null) {
		    	    return true;
		       }
		       
		       return false;

		
	}
}
