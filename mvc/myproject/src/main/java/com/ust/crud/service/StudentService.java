package com.ust.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.crud.entity.Student;
import com.ust.crud.repository.StudentRepo;

@Service
public class StudentService {
     @Autowired
     public StudentRepo repo;
	public Student create(Student a) {
		// TODO Auto-generated method stub
		return repo.save(a);
	}
	public Optional<Student> getId(Integer id) {
	
		return repo.findById(id);
	}
	public Student updateId(Integer id, Student e) {
		
		Student s = null;
		Optional<Student> ob= repo.findById(id);
		if(ob.isPresent()) {
			s=ob.get();
			s.setName(e.getName());
			s.setEmail(e.getEmail());
			s.setPhno(e.getPhno());
			return repo.save(s);
		}
		else {
			return null;
		}
	}
	

}
