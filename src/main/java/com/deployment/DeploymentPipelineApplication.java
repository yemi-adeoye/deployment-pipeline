package com.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeploymentPipelineApplication {
	
	
	@GetMapping("/")
	public static String helloWorld() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DeploymentPipelineApplication.class, args);
	}

}
