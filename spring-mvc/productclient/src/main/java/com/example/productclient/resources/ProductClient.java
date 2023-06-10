package com.example.productclient.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController   
@RequestMapping("/client")
public class ProductClient {      
    
	@Autowired
	RestTemplate template;
	
	
	@GetMapping
	public String TestMethod() {
		return "working"; 
	}
	
	
}
