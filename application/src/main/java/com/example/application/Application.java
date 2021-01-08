package com.example.application;

import com.example.common_library.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.example.common_library","com.example.application"})
@RestController
public class Application {
	@Autowired TestService testService;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/abc")
	public String get(){
		return testService.getString();
	}
}
