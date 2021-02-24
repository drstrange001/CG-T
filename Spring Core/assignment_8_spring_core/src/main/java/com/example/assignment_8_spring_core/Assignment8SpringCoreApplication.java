package com.example.assignment_8_spring_core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Assignment8SpringCoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(Assignment8SpringCoreApplication.class, args);
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }

}
