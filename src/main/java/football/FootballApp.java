package football;

public class FootballApp {
    public static void main(String[] arg) {
        FootballClub firstClub = new FootballClub("one");
        FootballClub secondClub = new FootballClub("two", 7, 100);
        firstClub.setTitleNumber(5);
        firstClub.setbBudget(120);
        secondClub.buyPlayer(12);
        firstClub.sellPlayer(31);
        secondClub.playTitle();
        firstClub.playTitle();
        firstClub.checkTitle();
        secondClub.checkTitle();
    }
}