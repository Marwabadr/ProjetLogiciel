package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.demo.repositories")
@EntityScan(basePackages = "com.example.demo.Models")
@ComponentScan({"com.example.demo.Controllers", "com.example.demo.Services","com.example.demo.Config"})

public class ProjetGlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetGlApplication.class, args);
	}

}
