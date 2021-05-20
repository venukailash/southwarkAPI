package com.southwark.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SouthwarkApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SouthwarkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}