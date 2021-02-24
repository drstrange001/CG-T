package com.company;

import java.util.Scanner;

public class Satyam1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder stringBuilder =   new StringBuilder(input);
        String after = stringBuilder.reverse().toString();
        int count = 0;
        for (int i = 0, j = after.length()-1; i < input.length(); i++, j--){
            if(input.charAt(i) == after.charAt(j)){
                count++;
            }
        }
        System.out.println(count);
    }

}
