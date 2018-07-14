package com.example.HelloAppEngine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloAppEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAppEngineApplication.class, args);
	}
	
	@GetMapping("/")
    public String hello() {
            return "Hello Spring Boot!";
    }
	
	@GetMapping("/user/{username}")
	public String SayHello(@PathVariable String username) {
		return "Say Hi >"+username;
	}
}
