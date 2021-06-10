package football;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballPlayerTest {

    @Test
    void setPlayerName() {
        FootballPlayer p1 = new FootballPlayer();
        p1.setPlayerName("uno");
        String expected = "unos";
        assertEquals (p1.getPlayerName(), expected);
    }
}