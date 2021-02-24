package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Hari {
    //        if(arr.length == 0){
//            return 0;
//        }
//        return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
    public static int sum(int[] arr){
        return sum(arr, 0);
    }



    private static int sum(int[] arr, int x) {
        if(x == arr.length){
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.size()
        return arr[x] + sum(arr, x+1);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] a = Arrays.copyOfRange(arr, 1, arr.length);
        for (Integer i : a){
            System.out.println(i);
        }
        System.out.println(sum(arr));
        //        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int [] arr = new int[n];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = scanner.nextInt();
//        }
//        int count = 0;
//        boolean isIncreasing = false;
//        if(arr[0] < arr[1]){
//            isIncreasing = true;
//        }
//        for(int i = 0; i < arr.length-1; i++){
//            if(isIncreasing && arr[i] > arr[i+1]){
//                count++;
//                isIncreasing = false;
//            }else if(!isIncreasing && arr[i] < arr[i+1]){
//                count++;
//                isIncreasing = true;
//            }else if(arr[i] == arr[i+1]){
//                System.out.println(false);
//                return;
//            }
//        }
//        System.out.println(count <= 1);
    }

}
