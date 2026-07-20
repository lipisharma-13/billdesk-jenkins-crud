package com.example.standalone_demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.standalone_demo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	Employee createEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Long id, Employee employee);

	void deleteEmployee(Long id);
	
}
