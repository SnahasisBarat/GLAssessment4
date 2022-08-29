package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootApplicationusingEurekaServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationusingEurekaServer1Application.class, args);
	}
	
	@GetMapping("/hello")
    public String eureka() {

	 return "This is Eureka client application";

	 }

}
