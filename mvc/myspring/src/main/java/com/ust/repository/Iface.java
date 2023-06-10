package com.ust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.entity.Employee;
@Repository
public interface Iface extends JpaRepository<Employee,Integer> {
	

}
