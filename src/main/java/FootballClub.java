public class FootballClub {
    public String name;
    public int titleNumber;
    protected int sellBudget;
    protected double budget;


    public  FootballClub(String name, int titleNumber, int sellBudget) {
        this.name = name;
        this.titleNumber = titleNumber;
        this.sellBudget = sellBudget;


    }

    public FootballClub(double budget, String name) {
        this.name = name;
        this.budget = budget;


    }

    public  FootballClub() {
        name = "Unknown";
        titleNumber = 0;
        sellBudget = 10;

    }

    public int sellPlayer(int price) {
        int s;
        s = sellBudget + price;
        return s;
    }

    public int buyPlayer(int price, int transferBudget) {
        int b;
        b = transferBudget - price;
        return b;
    }

    public double buyPlayer(double price, double transferBudget) {
        double b;
        b = transferBudget - price;
        return b;
    }

    public void playTitle() {
        if (sellBudget >= 100) {
            titleNumber++;
        }
    }

    public void checkTitle(int newTitle) {
        if (newTitle != titleNumber) {
            System.out.println(name + " Plays in Super League");
        } else {
            System.out.println(name + " Does not Play in Super League");
        }
    }
}