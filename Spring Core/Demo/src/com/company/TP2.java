package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int input = 0;
        while (input >= 0){
            input = scanner.nextInt();
            arr.add(input);
        }
        System.out.println(processArray(arr));
    }

    public static int processArray(ArrayList<Integer> arr){

        int count = 0;
        for (Integer i : arr){
            if (i >= 10){
                count++;
            }
        }
        return count;
    }
}
