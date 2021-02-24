package com.example.assignment_one_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AssignmentOneCoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(AssignmentOneCoreApplication.class, args);
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);
    }

}
