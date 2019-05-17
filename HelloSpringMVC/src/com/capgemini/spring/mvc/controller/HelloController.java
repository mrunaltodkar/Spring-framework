package com.capgemini.spring.mvc.controller;

import org.springframework.stereotype.Controller;

//http://localhost:8989/HelloSpringMVC/app/hello

@Controller
public class HelloController {

	public String sayHello() {
		return "hello";
		
	}
}
