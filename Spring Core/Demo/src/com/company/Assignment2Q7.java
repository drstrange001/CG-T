package com.company;

abstract class DesertItem {

    abstract public int getCost();
}

class Candy extends DesertItem {
    int amount = 0;
    public int addCandies(int candies) {
        return ++amount;
    }

    @Override
    public int getCost() {
        return 60;
    }
}

class Cookie extends DesertItem {
    int amount = 0;
    public int addCookies(int candies) {
        return ++amount;
    }

    @Override
    public int getCost() {
        return 70;
    }
}

class IceCream extends DesertItem {
    int amount = 0;
    public int addIceCreams(int candies) {
        return ++amount;
    }

    @Override
    public int getCost() {
        return 1;
    }
}

public class Assignment2Q7 {
    public static void main(String[] args) {
    }

    private void selectRoles() {
    }

    private void roles(String role) {
    }

    private void addItems() {
    }

    private void addItemsOperation(int choice) {
    }

    private void placeOrder() {
    }

    private void placeOrderOperation(int choice) {
    }
}