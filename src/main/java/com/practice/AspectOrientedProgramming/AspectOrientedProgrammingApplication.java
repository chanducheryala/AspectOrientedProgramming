package com.practice.AspectOrientedProgramming;

import com.practice.AspectOrientedProgramming.dao.AccountDAO;
import com.practice.AspectOrientedProgramming.service.TrafficFortuneService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AspectOrientedProgrammingApplication {

	public static void main(String[] args) {

		SpringApplication.run(AspectOrientedProgrammingApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, TrafficFortuneService trafficFortuneService) {
		return runner -> {
//			addAccount(accountDAO);
//			findAllAccounts(accountDAO);

			demoAroundAdvice(trafficFortuneService);

		};
	}

	private void demoAroundAdvice(TrafficFortuneService trafficFortuneService) {
		System.out.println("Calling getFortune()");
		String data = trafficFortuneService.getFortune();
		System.out.println("My fortune :" + data);
		System.out.println("Finished\n");
	}

	private void findAllAccounts(AccountDAO accountDAO) {
		List<Account> accounts = accountDAO.findAll();
		System.out.println("The Accounts : " + accounts);
	}

	private void addAccount(AccountDAO accountDAO) {
		accountDAO.addAccount();
	}
}
