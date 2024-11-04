package ipa-practice-explore-site.quest2;

import java.util.*;
import java.util.*;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getRuns() {
        return this.runs;
    }

    public void setPlayerType(String type) {
        this.playerType = type;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getMatchType() {
        return this.matchType;
    }
}

public class soln35mrk {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for 5 players:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Player ID: ");
            int playerId = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Player Name: ");
            String playerName = sc.nextLine();
            System.out.print("Enter Runs: ");
            int runs = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Player Type: ");
            String playerType = sc.nextLine();
            System.out.print("Enter Match Type: ");
            String matchType = sc.nextLine();

            players.add(new Player(playerId, playerName, runs, playerType, matchType));
        }

        System.out.print("Enter player type to find minimum runs: ");
        String typeInput = sc.nextLine();
        int minRuns = fun1(players, typeInput);
        System.out.println("Minimum runs for player type \"" + typeInput + "\": "
                + (minRuns != -1 ? minRuns : "No players found"));

        System.out.print("Enter match type to sort players by ID: ");
        String matchTypeInput = sc.nextLine();
        Player[] sortedPlayers = fun2(players, matchTypeInput);

        if (sortedPlayers.length > 0) {
            System.out.println("Players sorted by ID (descending) for match type \"" + matchTypeInput + "\":");
            for (Player p : sortedPlayers) {
                System.out.println(
                        "Player ID: " + p.getPlayerId() + ", Name: " + p.getPlayerName() + ", Runs: " + p.getRuns());
            }
        } else {
            System.out.println("No players found with match type \"" + matchTypeInput + "\".");
        }

        sc.close();
    }

    // Method to find minimum runs by player type
    public static int fun1(List<Player> players, String type) {
        int minRuns = Integer.MAX_VALUE;
        boolean found = false;

        for (Player p : players) {
            if (p.getPlayerType().equalsIgnoreCase(type)) {
                minRuns = Math.min(minRuns, p.getRuns());
                found = true;
            }
        }

        return found ? minRuns : -1;
    }

    // Method to return players of a certain match type sorted by player ID in
    // descending order
    public static Player[] fun2(List<Player> players, String type) {
        List<Player> newList = new ArrayList<>();

        for (Player p : players) {
            if (p.getMatchType().equalsIgnoreCase(type)) {
                newList.add(p);
            }
        }

        Player[] newArr = newList.toArray(new Player[0]);
        if (newArr.length == 0)
            return newArr;

        Arrays.sort(newArr, (p1, p2) -> Integer.compare(p2.getPlayerId(), p1.getPlayerId()));
        return newArr;
    }
}
