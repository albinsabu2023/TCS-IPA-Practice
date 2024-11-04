import java.util.*;
package com.albin.vegetable;

class Vegetable {
    private int vegId;
    private String vegName;
    private int pricing;
    private int rating;

    public int getVegId() {
        return vegId;
    }

    public void setVegId(int vegId) {
        this.vegId = vegId;
    }

    public String getVegName() {
        return vegName;
    }

    public void setVegName(String vegName) {
        this.vegName = vegName;
    }

    public int getPricing() {
        return pricing;
    }

    public void setPricing(int pricing) {
        this.pricing = pricing;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Vegetable(int vegId, String vegName, int pricing, int rating) {
        this.vegId = vegId;
        this.vegName = vegName;
        this.pricing = pricing;
        this.rating = rating;
    }
}

public class Main {
    public static void main(String[] args) {

        Vegetable v1 = new Vegetable(1001, "carrot", 90, 5);
        Vegetable v2 = new Vegetable(1002, "Tomato", 40, 3);
        Vegetable v3 = new Vegetable(1003, "Beetroot", 80, 4);
        Vegetable v4 = new Vegetable(1004, "Onion", 78, 1);
        List<Vegetable> vegetables = new ArrayList<>(Arrays.asList(v1, v2, v3, v4));
        int rating = 2;
        List<Vegetable> ans = sortedList(vegetables, rating);
        for (Vegetable v : ans) {
            System.out.println(v.getVegName());
        }
        Vegetable v = secondMinimumRating(vegetables);
        System.out.println("min rating veg " + v.getVegName());
    }

    private static Vegetable secondMinimumRating(List<Vegetable> vegetables) {
        int minRating = Integer.MAX_VALUE;
        int seconMinRating = Integer.MAX_VALUE;
        Vegetable ans = vegetables.get(0);
        Vegetable ans2 = ans;
        for (Vegetable v : vegetables) {
            if (v.getRating() < minRating) {
                seconMinRating = minRating;
                minRating = v.getRating();
                ans2 = ans;
                ans = v;
            } else if (v.getRating() > minRating && v.getRating() < seconMinRating) {
                seconMinRating = v.getRating();

                ans2 = v;
            }

        }
        return ans2;
    }

    private static List<Vegetable> sortedList(List<Vegetable> vegetables, int rating) {
        return vegetables.stream()
                .filter(v -> v.getRating() > rating)
                .sorted(Comparator.comparing(Vegetable::getPricing))
                .toList();
    }
}
