package com.test.testing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellowordcontroller {
	
	@RequestMapping("/hello")
	public String returnHello()
	{
		return "Hello Parag";
	}

}
