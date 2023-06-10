package com.ust.crud.entity.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.crud.entity.Student;
import com.ust.crud.service.StudentService;
@RestController
@RequestMapping("/student")
public class StudentController {
     @Autowired
     public StudentService service;
     
     @PostMapping("/create")
     public Student student(@RequestBody Student a)
     {
    	 return service.create(a);
     }
     @GetMapping("/get/{id}")
     public Optional<Student> student(@PathVariable Integer id)
     {
    	 return service.getId(id);
     }
     @PutMapping("/update/{id}")
     public Student update(@RequestBody Student e, @PathVariable Integer id ) {
    	 return service.updateId(id,e);
     }
//     @DeleteMapping("/delete")
//     public Student student()
}
