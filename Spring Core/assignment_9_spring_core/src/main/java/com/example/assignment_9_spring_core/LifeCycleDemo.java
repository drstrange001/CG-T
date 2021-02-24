package com.example.assignment_9_spring_core;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleDemo implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean initialized");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean destroyed");
    }
}
