package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.controller"})
public class GitHubTesting1Application {

	public static void main(String[] args) {
		SpringApplication.run(GitHubTesting1Application.class, args);
	}

}
