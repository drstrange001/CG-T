package com.company;

public class Q8 {


    public static void main(String[] args) throws NumException {
        checkNumber(23);
        int x = 24;
        checkNumber(-2);
    }

    private static void checkNumber(int i) throws NumException {
        if(i < 0){
            throw new NumException();
        }
    }
}

class NumException extends Exception{
    public NumException() {
        super("Please pass a +ve integer!");
    }
}