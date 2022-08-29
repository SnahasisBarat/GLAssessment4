package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootDocker2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDocker2Application.class, args);
	}

	@GetMapping("/docker")
	public String sayDocker()

	 {

	 return "Welcome To Docker Application";

	 }

}
