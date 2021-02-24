package com.company;

/*
• If any class has any of its method abstract then you must declare entire class abstract.

• Abstract class cannot be instantiated.

• When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.

• Abstract class cannot be private.

• Abstract class cannot be final.

• You can declare a class abstract without having any abstract method.
*/

abstract class A{
    abstract void fun();
}


public class Assignment2Q4 extends A{
    public static void main(String[] args) {

    }

    @Override
    void fun() {
        System.out.println("Abstract function implemented");
    }
}
