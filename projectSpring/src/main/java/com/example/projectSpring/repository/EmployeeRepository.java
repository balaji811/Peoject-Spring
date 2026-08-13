package com.example.projectSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.projectSpring.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer >{
   
	 @Query("SELECT e FROM Employee e WHERE e.email = :email AND e.password = :password")
	    Employee findByEmailPassword(
	        @Param("email") String email,
	        @Param("password") String password
	    );
	 
	 @Query("SELECT e FROM Employee e WHERE e.email = :email")
	 Employee findbyEmail(@Param("email") String email);
}
