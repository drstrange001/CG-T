package com.company;

import java.util.Scanner;

class SiCi {

    public double simpleInterest(double principalAmount,int time,double interestRate){
        return (principalAmount * time * interestRate)/100;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        return (principalAmount * Math.pow((1 + (interestRate/100)), time)) - principalAmount;
    }
}

public class Assignment1Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        double r = scanner.nextDouble();
        int t = scanner.nextInt();
        SiCi obj = new SiCi();
        System.out.println(obj.simpleInterest(p, t, r));
        System.out.println(obj.compoundInterest(p, t, r));
    }
}
