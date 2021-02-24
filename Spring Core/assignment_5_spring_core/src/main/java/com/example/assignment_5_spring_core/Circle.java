package com.example.assignment_5_spring_core;

import org.springframework.stereotype.Component;

@Component
public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
