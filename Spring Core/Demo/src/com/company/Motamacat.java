package com.company;

import java.util.Scanner;

public class Motamacat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ids = new int[n];
        for (int i = 0; i < n; i++){
            ids[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++){
            System.out.print(getDeliveries(ids[i]) + " ");
        }
    }

    private static int getDeliveries(int id) {
        int sum = 0;
        while (id != 0){
            sum += id%10;
            id /= 10;
        }
        return sum;
    }
}
