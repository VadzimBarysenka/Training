package football;

import java.util.*;

public class FootballClub {
    private final String name;
    private int titleNumber;
    private int budget;
    Set<FootballPlayer> squad = new HashSet<>();
    FootballPlayer player = new FootballPlayer();

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

    public void sellPlayer(FootballPlayer FootballPlayer) {
        budget = budget + FootballPlayer.getPlayerPrice();
        squad.remove(FootballPlayer);
    }

    public void buyPlayer(FootballPlayer FootballPlayer) {
        budget = budget - FootballPlayer.getPlayerPrice();
        squad.add(FootballPlayer);
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