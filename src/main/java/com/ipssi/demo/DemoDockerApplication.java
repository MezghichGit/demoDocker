package com.ipssi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController

public class DemoDockerApplication {

	@GetMapping(value="/home", produces=MediaType.TEXT_PLAIN_VALUE)
	public String home() {
	return "Hello Docker";
	}
	@GetMapping(value="/ipssi", produces=MediaType.TEXT_PLAIN_VALUE)
	public String bye() {
	return "Ici c'est IPSSI";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
	}

}
