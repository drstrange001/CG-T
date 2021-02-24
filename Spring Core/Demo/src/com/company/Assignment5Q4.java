package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String  toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
public class Assignment5Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(new Comparator<Transaction>() {
                    @Override
                    public int compare(Transaction o1, Transaction o2) {
                        return  o1.getValue()-o2.getValue();
                    }
                })
                .collect(Collectors.toList());
    }

    public static List<Integer> transaction3sValuesDelhi(List<Transaction> transactions) {
        List<Integer> transactionsDelhi = new ArrayList<>();
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Delhi"))
                .forEach(transaction -> transactionsDelhi.add(transaction.getValue()));
        return transactionsDelhi;
    }
    public static int highestTransaction2(List<Transaction> transactions){
        Optional<Transaction> transaction = transactions.stream()
                .max(new Comparator<Transaction>() {
                    @Override
                    public int compare(Transaction o1, Transaction o2) {
                        return o1.getValue()-o2.getValue();
                    }
                });
        return transaction.get().getValue();
    }

    public static int smallestTransaction1(List<Transaction> transactions){
        Optional<Transaction> transaction = transactions.stream()
                .min(new Comparator<Transaction>() {
                    @Override
                    public int compare(Transaction o1, Transaction o2) {
                        return o1.getValue()-o2.getValue();
                    }
                });
        return transaction.get().getValue();
    }

    public static void main(String[] args) {}
}