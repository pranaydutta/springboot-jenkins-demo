package com.dutta.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsDemoApplication.class, args);
	}

	@GetMapping("/hello")
		public String message()
		{
			return "going through very tough situtation";
		}
}
