package com.company;
import java.util.Scanner;
public class CordisTestTwo {
    private static final String passed = "PASSED";
    private static final String failed = "FAILED";
    private static final int constFive = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++){
            int n = scanner.nextInt();
            if(checkNum(n)){
                System.out.println(n + " : " + passed);
            }else{
                System.out.println(n + " : " +failed);
            }
        }
    }
    private static boolean checkNum(int n) {
        return checkNum(0, n, 0);
    }
    private static boolean checkNum(int sum, int n, int p) {
        if(sum > n){
            return false;
        }else if(sum == n){
            return true;
        }
        return checkNum((int) (sum + Math.pow(constFive, p)), n, p+1) || checkNum((int) (sum + Math.pow(constFive, p)), n, p+2)
                || checkNum(sum, n, p-1);
    }
}
