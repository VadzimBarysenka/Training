public class FootballApp {
    public static void main(String[] arg) {
        FootballClub firstClub = new FootballClub("first", 5, 100);
        FootballClub secondClub = new FootballClub(30.1, "second");
        int newTitle = firstClub.titleNumber;
        firstClub.sellBudget = firstClub.sellPlayer(1);
        int transferBuy = firstClub.buyPlayer(77, 57);
        firstClub.playTitle();
        firstClub.checkTitle(newTitle);
        secondClub.budget = secondClub.buyPlayer(13.2, 56.7);
    }
}