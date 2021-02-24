package com.example.assignment_2_spring_core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Assignment2SpringCoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(Assignment2SpringCoreApplication.class, args);
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Question questionAnswerTypeList = (Question) context.getBean("questionAnswerTypeList");
//        Question questionAnswerTypeSet = (Question) context.getBean("questionAnswerTypeSet");
//        System.out.println(questionAnswerTypeList);
//        System.out.println(questionAnswerTypeSet);
        Question question = (Question) context.getBean("questionAnswerTypeMap");
        System.out.println(question);
    }

}
