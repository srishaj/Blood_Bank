package com.quest.bloodbankspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BloodbankspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodbankspringApplication.class, args);
		System.out.println("connection successful");
	}

}
