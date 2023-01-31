package com.example.configureswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.configureswagger")
public class ConfigureSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigureSwaggerApplication.class, args);
	}

}
