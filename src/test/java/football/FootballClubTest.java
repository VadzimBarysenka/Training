package football;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballClubTest {
    private static final int BUDGET = 10;
    private static final int PLAYER_PRICE = 2;

    @Test
    void buyPlayer() {
        FootballClub club1 = new FootballClub();
        FootballPlayer player1 = new FootballPlayer();
        int RESULT = BUDGET - PLAYER_PRICE;

        club1.setBudget(BUDGET);
        player1.setPlayerPrice(PLAYER_PRICE);
        club1.buyPlayer(player1);

        assertEquals(RESULT, club1.getBudget());
    }

    @Test
    void sellPlayer() {
        FootballClub c1 = new FootballClub();
        FootballPlayer p1 = new FootballPlayer();

        c1.setBudget(10);
        p1.setPlayerPrice(5);
        c1.sellPlayer(p1);

        assertEquals(15, c1.getBudget());
    }
}