package com.example.sts_check;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StsCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(StsCheckApplication.class, args);
		System.out.println("serverStarted.../");
		System.out.println("first request..//");
		System.out.println("i have added this line in hotfix");
	}

}
