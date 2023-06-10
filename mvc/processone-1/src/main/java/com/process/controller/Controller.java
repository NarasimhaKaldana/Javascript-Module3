package com.process.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.process.entity.StudentDetails;

@RestController
@RequestMapping("/student")

public class Controller {

   @Autowired
   private StudentDetails studentDetails;
   @PostMapping("/add")
   public StudentDetails addDetails(@RequestBody StudentDetails studentDetails) {
	   return studentService.addDetails(studentDetails);
   }
   
	
}
