package com.ust.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	private String empid;
	private String empname;
	private String address;
	private String location;

}
