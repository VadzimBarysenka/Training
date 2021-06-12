package football;

import java.util.*;

public class FootballClub {
    private String name;
    private int titleNumber;
    private int budget;
    private Set<FootballPlayer> squad = new HashSet<>();

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Set<FootballPlayer> getSquad() {
        return squad;
    }

    public void setSquad(Set<FootballPlayer> squad) {
        this.squad = squad;
    }

    public void sellPlayer(FootballPlayer footballPlayer) {
        budget = budget + footballPlayer.getPlayerPrice();
        squad.remove(footballPlayer);
    }

    public void buyPlayer(FootballPlayer footballPlayer) {
        if (budget >= footballPlayer.getPlayerPrice()) {
            budget = budget - footballPlayer.getPlayerPrice();
            squad.add(footballPlayer);
        } else {
            System.out.println(name + ", calm down you are not PSG");
        }
    }

    public void playTitle() {
        int defaultBudget = 100;
        if (budget >= defaultBudget) {
            titleNumber++;
        }
    }

    public void checkTitle() {
        int defaultTitle = 7;
        if (titleNumber >= defaultTitle) {
            System.out.println(name + " plays in Super League");
        } else {
            System.out.println(name + " does not play in Super League");
        }
    }
}