package football;


import java.util.HashSet;
import java.util.Set;

public class FootballApp {
    public static void main(String[] arg) throws Exception {
        FootballClub secondClub = new FootballClub("two", 7, 200);
        FootballPlayer player1 = new FootballPlayer();
        player1.setPlayerName("p1");
        player1.setPlayerPrice(5);
        FootballPlayer player2 = new FootballPlayer();
        player2.setPlayerName("p2");
        player2.setPlayerPrice(1);
        FootballPlayer player3 = new FootballPlayer();
        player3.setPlayerName("p3");
        player3.setPlayerPrice(3);
        FootballPlayer player4 = new FootballPlayer();
        player4.setPlayerName("p4");
        player4.setPlayerPrice(4);
        Set<FootballPlayer> team = new HashSet<>();
        team.add(player1);
        team.add(player3);
        team.add(player3);
        secondClub.setSquad(team);
        secondClub.buyPlayer(player1);
        secondClub.buyPlayer(player2);
        secondClub.buyPlayer(player3);
        secondClub.buyPlayer(player4);
        secondClub.sellPlayer(player1);
        OperationJson.WriteJson(secondClub,"src/main/resources/test2.json");
        System.out.println("Current budget " + secondClub.getBudget() + " $");
    }
}