package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(scanBasePackages = "com.example.common_library")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
