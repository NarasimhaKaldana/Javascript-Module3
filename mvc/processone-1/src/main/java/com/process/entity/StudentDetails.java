package com.process.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetails {
 
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private Long phno;
	private String email;
}
