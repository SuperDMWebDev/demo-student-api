package com.example.DemoUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	// get http method http://localhost:8080/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "HEllo world";
	}
}
