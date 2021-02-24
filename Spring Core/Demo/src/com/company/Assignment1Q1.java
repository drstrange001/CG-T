package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {

        int newNum = 0, rem = 0, originalNum = num;
        int numOfDigits = countDigits(num);

        while(num > 0)  {
            rem = num % 10;
            num /= 10;
            newNum += (int)Math.pow(rem, numOfDigits);
        }
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        Object[] a = ar.toArray();
        for(Object i : a){
            System.out.println(i);
        }
        if(newNum==originalNum)
            return true;

        return false;
    }

    public int countDigits(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }

}

public class Assignment1Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArmstrongOrNot obj = new ArmstrongOrNot();
        System.out.println(obj.armstrongCheck(num));
    }
}
