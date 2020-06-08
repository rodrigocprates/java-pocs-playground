package com.rptech.springasyncoperations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringAsyncOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAsyncOperationsApplication.class, args);
	}

}
