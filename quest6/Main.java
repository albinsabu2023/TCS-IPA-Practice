package quest6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Cricket {
    private int id;
    private String playerName;
    private int plaerRanking;
    private int matchesPlayed;
    private int runs;

    public Cricket(int id, String playerName, int plaerRanking, int matchesPlayed, int runs) {
        super();
        this.id = id;
        this.playerName = playerName;
        this.plaerRanking = plaerRanking;
        this.matchesPlayed = matchesPlayed;
        this.runs = runs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlaerRanking() {
        return plaerRanking;
    }

    public void setPlaerRanking(int plaerRanking) {
        this.plaerRanking = plaerRanking;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

}

public class Main {
    public static void main(String[] args) {
        // manuallly you can read input using loop
        /*
         * List<Cricket> input=new ArrayList<>();
         * Scanner sc=new Scanner(System.in);
         * for (int i=0;i<4;i++){
         * int a=sc.nextInt();
         * String b=sc.nextLine();sc.nextInt();
         * int c=sc.nextInt();
         * int d=sc.nextInt();
         * int e=sc.nextInt();
         * Cricket c=new Cricket(a,b,c,d,e);
         * input.add(c);
         * }
         */
        Cricket c1 = new Cricket(100, "Sachin", 5, 150, 13000);
        Cricket c2 = new Cricket(101, "Sewag", 4, 120, 10000);
        Cricket c3 = new Cricket(102, "Dhoni", 7, 110, 7000);
        Cricket c4 = new Cricket(103, "Kohli", 15, 57, 4400);
        List<Cricket> players = new ArrayList<>(Arrays.asList(c1, c2, c3, c4));
        List<Character> ans = getAverageRuns(players, 100);
        for (char ch : ans) {
            System.out.println("Grade" + ch);
        }

    }

    private static List<Character> getAverageRuns(List<Cricket> players, int input) {
        List<Cricket> filtered = players.stream()
                .filter(c -> c.getMatchesPlayed() > input)
                .collect(Collectors.toList());
        List<Character> ans = new ArrayList<>();
        for (Cricket c : filtered) {
            double avg = c.getRuns() / c.getMatchesPlayed();
            if (avg > 70 && avg < 90) {
                ans.add('A');
            } else if (avg < 69 && avg > 50) {
                ans.add('B');
            }
        }
        return ans;
    }

}
