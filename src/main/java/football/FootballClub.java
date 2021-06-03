package football;

import java.util.ArrayList;

public class FootballClub {
    private String name;
    private int titleNumber;
    private int budget;
    ArrayList<String> squad = new ArrayList<>();

    public FootballClub(String name, int titleNumber, int budget) {
        this.name = name;
        this.titleNumber = titleNumber;
        this.budget = budget;
    }

    public FootballClub(String name) {
        this.name = name;
    }

    public FootballClub() {
        name = "Unknown";
        titleNumber = 0;
        budget = 10;
    }

    public int getTitleNumber() {
        return titleNumber;
    }

    public void setTitleNumber(int titleNumber) {
        this.titleNumber = titleNumber;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void sellPlayer(String playerName) {
        budget = budget + FootballPlayer.playerPrice;
        squad.remove(playerName);
    }

    public void buyPlayer(String playerName) {
        budget = budget - FootballPlayer.playerPrice;
        squad.add(playerName);
    }

    public void playTitle() {
        int b = 100;
        if (budget >= b) {
            titleNumber++;
        }
    }

    public void checkTitle() {
        int t = 7;
        if (titleNumber >= t) {
            System.out.println(name + " plays in Super League");
        } else {
            System.out.println(name + " does not play in Super League");
        }
    }
}