package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
//		throw new RuntimeException("error in hello world bean service");
		return new HelloWorldBean(String.format("Hello world bean"));
	}
	
	
	@GetMapping("/hello-world-bean/{message}")
	public HelloWorldBean helloWorldBean(@PathVariable String message) {
		return new HelloWorldBean(String.format("Hello, %s", message));
	}

}
