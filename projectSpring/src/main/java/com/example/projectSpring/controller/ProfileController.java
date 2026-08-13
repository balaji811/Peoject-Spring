package com.example.projectSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectSpring.model.Employee;
import com.example.projectSpring.service.ProfileService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	@GetMapping("profile/{email}")
	public ResponseEntity<Employee> profile(@PathVariable String email){
		
		 Employee e = profileService.profile(email);
		
		return ResponseEntity.ok(e);
		
		
		
	}
	
	

}
