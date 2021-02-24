package com.company;

import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
        double [] ar = new double[3];
        ar[0] = subject1Marks;
        ar[1] = subject2Marks;
        ar[2] = subject3Marks;
        int count = 0;
        for(Double i : ar){
            if(i >= 60){
                count++;
            }
            System.out.println(i);
        }
        System.out.println(count);
        String result = "";
        if(count == 3){
            result = "passed";
        }else if(count == 2){
            result = "passed\npromoted";
        }else{
            result = "failed";
        }
        return result;
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m1 = scanner.nextDouble();
        double m2 = scanner.nextDouble();
        double m3 = scanner.nextDouble();
        ResultDeclaration obj = new ResultDeclaration();
        System.out.println(obj.declareResults(m1, m2, m3));
    }
}