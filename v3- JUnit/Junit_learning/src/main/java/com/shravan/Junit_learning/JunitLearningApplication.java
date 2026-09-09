package com.shravan.Junit_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitLearningApplication {

	public int divide(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		SpringApplication.run(JunitLearningApplication.class, args);


	}




}
