package football;

public class FootballClub {
    private String name;
    private int titleNumber;
    private int budget;

    public int getTitleNumber() {
        return titleNumber;
    }

    public void setTitleNumber(int titleNumber) {
        this.titleNumber = titleNumber;
    }

    public int getBudget() {
        return budget;
    }

    public void setbBudget(int budget) {
        this.budget = budget;
    }

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

    public void sellPlayer(int price) {
        budget = budget + price;
    }

    public void buyPlayer(int price) {
        budget = budget - price;
    }
/*
    public double buyPlayer(double price, double transferBudget) {
        double b;
        b = transferBudget - price;
        return b;
    }

*/

    public void playTitle() {
        if (budget >= 100) {
            titleNumber++;
        }
    }

    public void checkTitle() {
        if (titleNumber >= 7) {
            System.out.println(name + " plays in Super League");
        } else {
            System.out.println(name + " does not play in Super League");
        }
    }
}