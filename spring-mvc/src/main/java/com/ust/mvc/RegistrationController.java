package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegistrationController {
//    @GetMapping
//	public String respond(Model model) {
//		//model.addAttribute("myName","Narasimha Kaldana");
//		return "response"; //view
//	}
	@PostMapping
	public String signup(@RequestParam("userName")String userName,
			@RequestParam("mailId")String mailId, Model model) {
//https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller#Controller		
		if(userName.length()>6 && mailId.length()>6) {
			model.addAttribute("myemail",mailId);
			return "success";
		
	}
	else {
		return "error";
	}
	
	
}
}
