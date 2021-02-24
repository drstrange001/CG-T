package com.company;

import java.util.*;

class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;

    public Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}

public class Assignment5Q1 {

    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
        ArrayList<String> fruitsSorted = new ArrayList<>();
        fruits
                .stream()
                .filter(fruit -> fruit.getCalories() < 100)
                .sorted(new Comparator<Fruit>() {
                    @Override
                    public int compare(Fruit o1, Fruit o2) {
                        return o2.getCalories() - o1.getCalories();
                    }
                })
                .forEach(fruit -> fruitsSorted.add(fruit.getName()));
        return fruitsSorted;
    }

    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) {
        ArrayList<Fruit> sorted = new ArrayList<>();
        fruits.stream()
                .sorted(new Comparator<Fruit>() {
                    @Override
                    public int compare(Fruit o1, Fruit o2) {
                        return o1.getColor().compareTo(o2.getColor());
                    }
                })
                .forEach(sorted::add);
        return sorted;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits) {
        ArrayList<Fruit> sorted = new ArrayList<>();
        fruits.stream()
                .filter(fruit -> fruit.getColor().equals("Red"))
                .sorted(new Comparator<Fruit>() {
                    @Override
                    public int compare(Fruit o1, Fruit o2) {
                        return o1.getPrice()-o2.getPrice();
                    }
                })
                .forEach(sorted::add);
        return sorted;
    }

    public static void main(String[] args) {
    }

}
