package football;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballClubTest {

    @Test
    void buyPlayer() {
        FootballClub c1 = new FootballClub();
        FootballPlayer p1 = new FootballPlayer();
        FootballPlayer p2 = new FootballPlayer();
        String s = c1.getName() + ", calm down you are not PSG";
        c1.setBudget(10);
        p1.setPlayerPrice(2);
        p2.setPlayerPrice(12);
        c1.buyPlayer(p1);
        c1.buyPlayer(p2);
        assertEquals(8, c1.getBudget());
        assertEquals((c1.getName() + ", calm down you are not PSG"), s);
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