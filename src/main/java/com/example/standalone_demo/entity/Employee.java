package com.example.standalone_demo.entity;

import org.springframework.data.annotation.Id;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
@Entity
@Table(name="employees")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
Long id;
String name;
String email;
String dept;
float salary;

public Employee() {
	super();
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

public Employee(Long id, String name, String email, String dept, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.dept = dept;
	this.salary = salary;
}


}
