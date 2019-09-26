package com.adulu.cat1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Cat1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cat1Application.class, args);
	}

}
