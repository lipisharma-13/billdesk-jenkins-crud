package com.example.standalone_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.standalone_demo.entity.Employee;
import com.example.standalone_demo.repo.EmployeeRepo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
	private final EmployeeRepo repo;
	public EmployeeController(EmployeeRepo repo) {
		this.repo=repo;
	}
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		//TODO: process POST request
		
		return repo.createEmployee(employee);
	}
	@GetMapping
    public List<Employee> getAllEmployees() {
        return repo.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return repo.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id,
                                   @RequestBody Employee employee) {

        return repo.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {

        repo.deleteEmployee(id);

        return "Employee deleted successfully.";
    }
}
