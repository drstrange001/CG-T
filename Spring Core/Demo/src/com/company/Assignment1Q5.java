package com.company;

import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
        double tax = 0d;
        if(ctc >= 0 && ctc <= 180000){
//            System.out.println("A");
            tax = 0;
        }else if(ctc >= 180001 && ctc <= 300000){
//            System.out.println("B");
            tax = (double)ctc * (10.0/100);
        }else if(ctc >= 300001 && ctc <= 500000){
//            System.out.println("C");
            tax = (double)ctc * (20.0/100);
        }else if(ctc >= 500001 && ctc <= 1000000){
//            System.out.println("D");
            tax = (double)ctc * (30.0/100);
        }
        return tax;
    }
}
public class Assignment1Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ctc = scanner.nextInt();
        TaxAmount obj = new TaxAmount();
        System.out.println(obj.calculateTaxAmount(ctc));
    }
}
