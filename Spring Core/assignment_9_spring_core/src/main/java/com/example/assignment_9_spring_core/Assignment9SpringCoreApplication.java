package com.example.assignment_9_spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Assignment9SpringCoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(Assignment9SpringCoreApplication.class, args);
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        LifeCycleDemo bean = (LifeCycleDemo) context.getBean("lifeCycleDemo");
    }

}
