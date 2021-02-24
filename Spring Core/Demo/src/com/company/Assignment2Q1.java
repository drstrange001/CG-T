package com.company;

class SingletonInheritanceCheck{
    private static SingletonInheritanceCheck instance = null;

    public SingletonInheritanceCheck(){}

    public SingletonInheritanceCheck getInstance(){
        if(instance == null){
            instance = new SingletonInheritanceCheck();
        }
        return instance;
    }
}
public class Assignment2Q1 {
    public static void main(String[] args) {

    }
}