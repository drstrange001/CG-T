package com.company;

import java.util.*;
import java.util.stream.Collectors;

class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;

    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", postedByUser='" + postedByUser + '\'' +
                ", commentByUser='" + commentByUser + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public int getNewsId() {
        return newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public String getComment() {
        return comment;
    }
}

public class Assignment5Q2 {
    public static int maxComments(List<News> news) {
        System.out.println("maxComments");
        Map<Integer, Long> map =  news.stream()
                .collect(Collectors.groupingBy(News::getNewsId,Collectors.counting()));
        int max = 0, maxKey = 0;
        for(Integer key : map.keySet()){
            if(map.get(key) > max){
                max = Math.toIntExact(map.get(key));
                maxKey = key;
            }
        }
//        System.out.println(map);
        return maxKey;
    }

    public static int budgetCount (List < News > news) {
        // System.out.println("budgetCount");
        return (int) news.stream()
                .filter(obj -> obj.getComment().contains("budget"))
                .count();
    }
    public static String maxCommentsByUser (List < News > news) {
        // System.out.println("maxCommentsByUser");
        // news.forEach(news1 -> System.out.println(news));
        Map<String, Long> map =  news.stream()
                .collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
        int max = 0;
        String maxKey = "";
        for(String key : map.keySet()){
            if(map.get(key) > max){
                max = Math.toIntExact(map.get(key));
                maxKey = key;
            }
        }
        return maxKey;
    }

    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {
        System.out.println("sortMaxCommentsByUser");
        Map<String, Long> map = news.stream()
                .collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
        TreeMap<String, Integer> map2 = new TreeMap<>();
        for(String key : map.keySet()){
            map2.put(key, Math.toIntExact(map.get(key)));
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map2.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static void main(String[] args) {
//        News obj = new News(1,"monu", "demo", "budget");
//        News obj2 = new News(2,"monu1", "demo", "b");
//        News obj3 = new News(1,"monu2", "demo", "c");
//        News obj4 = new News(1,"monu3", "demo", "d ");
//        ArrayList<News> list = new ArrayList<>();
//        list.add(obj);
//        list.add(obj2);
//        list.add(obj3);
//        list.add(obj4);
//        System.out.println(maxComments(list));
//        System.out.println(budgetCount(list));
    }
}