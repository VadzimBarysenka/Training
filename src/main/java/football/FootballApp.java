package football;


import java.io.IOException;

public class FootballApp {
    public static void main(String[] arg) throws IOException {
        FootballClub secondClub = new FootballClub("two", 7, 2);
        FootballClub c1 = OperationJson.ReadJson("src/main/resources/test.json");
        FootballPlayer player1 = new FootballPlayer();
        FootballPlayer player2 = new FootballPlayer();
        FootballPlayer player3 = new FootballPlayer();
        FootballPlayer player4 = new FootballPlayer();
        player1.setPlayerName("p1");
        player2.setPlayerName("p2");
        player3.setPlayerName("p3");
        player4.setPlayerName("p4");
        player1.setPlayerPrice(5);
        player2.setPlayerPrice(1);
        player3.setPlayerPrice(3);
        player4.setPlayerPrice(4);
        secondClub.buyPlayer(player1);
        secondClub.buyPlayer(player2);
        secondClub.buyPlayer(player3);
        c1.buyPlayer(player4);
        System.out.println("Current budget " + secondClub.getBudget() + " $");
        OperationJson.WriteJson(secondClub, "src/main/resources/test2.json");
    }
}