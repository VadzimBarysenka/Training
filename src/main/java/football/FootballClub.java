package football;

import java.io.IOException;
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
    public void setSquad(FootballPlayer footballPlayer) {
        squad.add(footballPlayer);
    }

    public void sellPlayer(FootballPlayer footballPlayer) throws Exception {
        if (!squad.isEmpty()) {
            if (squad.contains(footballPlayer)) {
                budget = budget + footballPlayer.getPlayerPrice();
                squad.remove(footballPlayer);
            } else {
                System.out.println("no such player in the squad");
            }
        } else {
            throw new Exception("club has no players");
        }
    }

    public void buyPlayer(FootballPlayer footballPlayer) throws Exception {
        if (budget >= footballPlayer.getPlayerPrice()) {
            budget = budget - footballPlayer.getPlayerPrice();
            squad.add(footballPlayer);
        } else {
            throw new IOException(name + " has no money to buy " + footballPlayer.getPlayerName());
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