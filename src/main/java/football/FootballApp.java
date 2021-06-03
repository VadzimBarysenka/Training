package football;

public class FootballApp {
    public static void main(String[] arg) {
        //FootballClub firstClub = new FootballClub("one");
        FootballClub secondClub = new FootballClub("two", 7, 10);
        FootballPlayer player1 = new FootballPlayer("pl1");
        FootballPlayer player2 = new FootballPlayer("pl2");
        player1.setPlayerPrice(5);
        player2.setPlayerPrice(2);
        secondClub.buyPlayer("pl1");
        secondClub.buyPlayer("pl2");
        //secondClub.sellPlayer("player1");
        System.out.println(secondClub.getBudget());
        System.out.println(secondClub.squad);
    }
}