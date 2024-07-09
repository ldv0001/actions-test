package ru.erp.git_actions_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitActionsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitActionsTestApplication.class, args);
		System.out.println("started on port 9090");
	}

}
