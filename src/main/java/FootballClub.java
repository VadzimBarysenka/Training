public class FootballClub {
    String name;
    int titleNumber;
    int sellBudget;
    double budget;


    public FootballClub(String name, int titleNumber, int sellBudget) {
        this.name = name;
        this.titleNumber = titleNumber;
        this.sellBudget = sellBudget;


    }

    public FootballClub(double budget, String name) {
        this.name = name;
        this.budget = budget;


    }

    public FootballClub() {
        name = "Unknown";
        titleNumber = 0;
        sellBudget = 10;

    }

    public static void main(String[] arg) {
        FootballClub firstClub = new FootballClub("first", 5, 100);
        FootballClub secondClub = new FootballClub(30.1, "second");
        int newTitle = firstClub.titleNumber;
        firstClub.sellBudget = firstClub.sellPlayer(166);
        int transferBuy = firstClub.buyPlayer(77, 257);
        firstClub.playTitle();
        firstClub.checkTitle(newTitle);
        secondClub.budget = secondClub.buyPlayer(13.2, 56.7);


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