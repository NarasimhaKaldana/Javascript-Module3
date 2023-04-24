package com.ust.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("/test")
public class FirstbootappApplication {
  
	final static Logger logger=LoggerFactory.getLogger(FirstbootappApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FirstbootappApplication.class, args);
		logger.trace("Application started successfully");
		logger.info("Application started successfully");
		logger.error("Application started successfully");
		logger.debug("Application started successfully");
		logger.warn("Application started successfully");
		

	}
   @GetMapping("/first")
  // @RequestMapping("/first")
	public String respond() {
		return "my first REST Controller";
		
	}
   @GetMapping("/second")
   //@RequestMapping("/second")
   public String message() {
		return "today we don't want break";
}
   @GetMapping("/third/{custname}")
   public String greetings(@PathVariable  String custname) {
	   return "Hello Dear"+ custname;
   }
   @GetMapping("/fourth/{custname}/{gender}")
   public String greetings(@PathVariable String custname,@PathVariable String gender) {
	   
   
   if(gender.equals("male")) {
	   return "Hello Mr."+ custname;
   }
   else if(gender.equals("female")) {
	   return "Hello Ms"+ custname;
   }
	   else {
		   return "invalid";
	   }
	   
	   
   }
   }

