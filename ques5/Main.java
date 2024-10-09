package ques5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sim {
    private int id;
    private String company;
    private int balance;
    private double ratesPerSec;
    private String circle;

    public Sim(int id, String company, int balance, double ratesPerSec, String circle) {
        super();
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratesPerSec = ratesPerSec;
        this.circle = circle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRatesPerSec() {
        return ratesPerSec;
    }

    public void setRatesPerSec(double ratesPerSec) {
        this.ratesPerSec = ratesPerSec;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

}

public class Main {
    public static void main(String[] args) {
        Sim s1 = new Sim(1, "Jio", 430, 1.32, "Mumbai");
        Sim s2 = new Sim(2, "Idea", 320, 2.26, "Mumbai");
        Sim s3 = new Sim(3, "Airtel", 500, 2.54, "Mumbai");
        Sim s4 = new Sim(4, "Vodafone", 640, 3.24, "Mumbai");
        List<Sim> sims = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));
        List<Sim> ans = solution(sims, "Mumbai", 3.4);
        for (Sim s : ans) {
            System.out.println(s.getId());
        }

    }

    private static List<Sim> solution(List<Sim> sims, String circle, double rate) {
        List<Sim> filteredList = new ArrayList<>();
        for (Sim s : sims) {
            if (s.getCircle().equalsIgnoreCase(circle) && s.getRatesPerSec() < rate) {
                filteredList.add(s);
            }
        }
        Sim[] newList = filteredList.toArray(new Sim[0]);
        Arrays.sort(newList, (o1, o2) -> Integer.compare(o2.getBalance(), o1.getBalance()));
        List<Sim> ans = Arrays.asList(newList);
        return ans;

        // implementation using stream Api
        /*
         * return sims.stream()
         * .filter(s->s.getCircle().contentEquals(circle)&&s.getRatesPerSec()<rate)
         * .sorted((o1,o2)->Integer.compare(o2.getBalance(), o1.getBalance()))
         * .collect(Collectors.toList());
         * 
         */
    }

}
