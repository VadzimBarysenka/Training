package football;


public class FootballApp {
    public static void main(String[] arg) {
        FootballClub secondClub = new FootballClub("two", 7, 17);
        FootballPlayer player1 = new FootballPlayer();
        FootballPlayer player2 = new FootballPlayer();
        player1.setPlayerName("p1");
        player2.setPlayerName("p2");
        player1.setPlayerPrice(5);
        player2.setPlayerPrice(5);
        secondClub.buyPlayer(player1);
        secondClub.buyPlayer(player2);
        secondClub.sellPlayer(player2);
        System.out.println(secondClub.getBudget());
        System.out.println(secondClub.squad);
    }
}