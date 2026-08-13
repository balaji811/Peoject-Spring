package com.example.projectSpring.model;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="dept")
	private String dept;
	@Column(name="email")
	private String email;
	@Column(name="salary")
	private Integer salary;
	@Column(name="password")
	private String password;
	
	public Employee() {
		 
	}
	
	public Employee(Integer id,String name,String dept,String email,Integer salary) {
		 this.id= id;
		 this.name = name;
		 this.dept = dept;
		 this.email = email;
		 this.salary = salary;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", email=" + email + ", salary=" + salary
				+ "]";
	}
	
	

}
