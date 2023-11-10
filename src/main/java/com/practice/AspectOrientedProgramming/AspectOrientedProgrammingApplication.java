package com.practice.AspectOrientedProgramming;

import com.practice.AspectOrientedProgramming.dao.AccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AspectOrientedProgrammingApplication {

	public static void main(String[] args) {

		SpringApplication.run(AspectOrientedProgrammingApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO) {
		return runner -> {
			addAccount(accountDAO);
		};
	}

	private void addAccount(AccountDAO accountDAO) {
		accountDAO.addAccount();
	}
}
