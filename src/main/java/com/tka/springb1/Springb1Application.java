package com.tka.springb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class Springb1Application {
	public static void main(String[] args) {
		SpringApplication.run(Springb1Application.class, args);
	}
}

