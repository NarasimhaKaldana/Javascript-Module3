package com.ust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.entity.Employee;
import com.ust.services.Services;

@RestController
@RequestMapping("/registration")
public class Controller {
	@Autowired
	private Services services;
	@PostMapping("/addemployees")
	public Employee addemployees (@RequestBody Employee employee) {
	return services.createEmployee(employee);	
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return services.getEmployees();
	}
}
