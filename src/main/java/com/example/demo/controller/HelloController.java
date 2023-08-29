package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class HelloController {
	
	@GetMapping("hii")
	public String welcome() {
		return "welcome to balasore ";
	}
	
	@GetMapping("hello")
	public Integer multiply() {
		return (10*50);
	}

}
