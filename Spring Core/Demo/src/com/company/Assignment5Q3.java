package com.company;
import java.util.*;
import java.util.stream.Collectors;

class Trader1 {
    private String name;
    private String city;

    public Trader1(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader1{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

public class Assignment5Q3 {
    public static List<String> printUniqueCities (List <Trader1> traders) {
//        Map<String, List<Trader>> distinctTraders = traders.stream()
//                .collect(Collectors.groupingBy(Trader::getCity));
        List<String> result = new ArrayList<>();
//        traders.forEach(trader -> System.out.println(trader.getCity()));
//        System.out.println("Unique");
        for(Trader1 trader : traders){
            if(!result.contains(trader.getCity())){
                result.add(trader.getCity());
            }
//            System.out.println(trader);
        }
        return result;
    }


    public static List<String> trader2sFromPuneSortByName(List<Trader1> traders) {
        List<Trader1> sortedTraders = traders.stream()
                .filter(trader -> trader.getCity().equals("Pune"))
                .sorted(new Comparator<Trader1>() {
                    @Override
                    public int compare(Trader1 o1, Trader1 o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                })
                .collect(Collectors.toList());
//        traders.forEach(trader -> System.out.println(trader));
        List<String> list =  new ArrayList<>();
        for(Trader1 trader : sortedTraders){
            list.add(trader.getName());
        }
        Collections.sort(list);
        return list;
    }
    public static String allTrader3Names(List<Trader1> traders) {
        StringBuilder s = new StringBuilder();
        List<Trader1> list = traders.stream()
                .sorted(new Comparator<Trader1>() {
                    @Override
                    public int compare(Trader1 o1, Trader1 o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                })
                .collect(Collectors.toList());
        for(Trader1 trader : list){
            s.append(trader.getName());
        }
        return s.toString();
    }
    public static ArrayList<Trader1> areAnyTrader4sFromIndore(ArrayList<Trader1> traders) {
        ArrayList<Trader1> indoreTraders = (ArrayList<Trader1>) traders.stream()
                .filter(trader -> trader.getCity().equals("Indore"))
                .collect(Collectors.toList());
        return indoreTraders;
    }

    public static void main(String[] args) {}
}














