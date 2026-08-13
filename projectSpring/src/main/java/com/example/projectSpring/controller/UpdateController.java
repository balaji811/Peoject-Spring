package com.example.projectSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectSpring.model.Employee;
import com.example.projectSpring.service.UpdateService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UpdateController {
   
	@Autowired
	private UpdateService updateService;
	@GetMapping("update/{email}")
	public ResponseEntity<Employee> updateProfile(@PathVariable String email){
		    
	   Employee e=	updateService.uProfile(email);
		 
	  
		    return ResponseEntity.ok(e);
	   

	}
	  
	@PostMapping("update/{email}")
	public ResponseEntity<String> updateProfile(@PathVariable String email, @RequestBody Employee employee){
		    
	   boolean a=	updateService.updateProfile(email,employee);
		 
	   if(a) {
		    return ResponseEntity.ok(" success");
	   }
		return ResponseEntity.ok(" not success");
	}
}
