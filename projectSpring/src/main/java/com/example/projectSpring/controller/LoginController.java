package com.example.projectSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectSpring.model.Employee;
import com.example.projectSpring.service.LoginService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class LoginController {
	
  @Autowired
  private LoginService loginService;
  
    @PostMapping("login")
    public ResponseEntity<String> login(@RequestBody Employee employee ) {
    	 
    	Employee e = loginService.login(employee);

        if (e != null) {
            return ResponseEntity.ok("success");
        }

        return ResponseEntity.ok("not success");
    	
    }
       
     
  
}
