package com.ust.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ust.entity.Employee;
import com.ust.repository.Iface;

public class Services {
@Autowired
private Iface repo;
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return  repo.save(employee);
	}
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
