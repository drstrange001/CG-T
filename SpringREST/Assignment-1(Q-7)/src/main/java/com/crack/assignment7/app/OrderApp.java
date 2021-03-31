package com.crack.assignment7.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.narwal.assingment7.controllers, com.narwal.assingment7.services")
@EnableAutoConfiguration
public class OrderApp {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(OrderApp.class, args);
	}
	
}
