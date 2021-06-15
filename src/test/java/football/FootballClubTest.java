package football;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FootballClubTest {
    private static final int BUDGET = 110;
    private static final int PLAYER1_PRICE = 20;
    private static final int PLAYER2_PRICE = 122;
    private static final int PLAYER3_PRICE = 12;
    private static final int TITLES = 10;
    private static final int CLUB_TITLES1 = 9;
    private static final int CLUB_TITLES2 = 1;


    @Test
    void buyPlayer() throws Exception {
        FootballClub club1 = new FootballClub();
        FootballPlayer player1 = new FootballPlayer();
        FootballPlayer player2 = new FootballPlayer();
        club1.setName("FC Club ");
        int RESULT = BUDGET - PLAYER1_PRICE;

        club1.setBudget(BUDGET);
        player1.setPlayerPrice(PLAYER1_PRICE);
        player2.setPlayerPrice(PLAYER2_PRICE);
        club1.buyPlayer(player1);
        club1.buyPlayer(player2);

        assertAll(
                "test",
                //() -> assertEquals((" has not money to buy "), s),
                () -> assertEquals(RESULT, club1.getBudget())
        );
    }

    @Test
    void sellExistingPlayerTest() throws Exception {
        FootballClub club1 = new FootballClub();
        FootballPlayer player1 = new FootballPlayer();
        club1.setBudget(BUDGET);
        player1.setPlayerPrice(PLAYER1_PRICE);
        club1.setSquad(player1);

        club1.sellPlayer(player1);

        assertEquals(130, club1.getBudget());
    }

    @Test
    void sellNotExistingPlayerTest() throws Exception {
        FootballClub club1 = new FootballClub();
        FootballPlayer player1 = new FootballPlayer();
        FootballPlayer player3 = new FootballPlayer();
        club1.setBudget(BUDGET);
        player1.setPlayerPrice(PLAYER1_PRICE);
        player3.setPlayerPrice(PLAYER3_PRICE);
        club1.setSquad(player3);
        String s = "no such player in the squad";

        club1.sellPlayer(player1);

        assertEquals(("no such player in the squad"), s);
    }


    @Test
    void playTitle() {
        FootballClub club1 = new FootballClub();
        club1.setBudget(BUDGET);
        club1.setTitleNumber(CLUB_TITLES1);

        club1.playTitle();

        assertEquals(club1.getTitleNumber(), TITLES);

    }

    @ParameterizedTest
    @ValueSource(ints = {6, 7, 8})
    void checkTitle(int titles) {
        FootballClub club1 = new FootballClub();
        FootballClub club2 = new FootballClub();
        club1.setTitleNumber(titles);
        club2.setTitleNumber(titles);
        String s1 = club1.getName() + " plays in Super League";
        String s2 = club1.getName() + " does not play in Super League";

        club1.checkTitle();
        club2.checkTitle();

        assertAll(
                () -> assertEquals((club1.getName() + " plays in Super League"), s1),
                () -> assertEquals((club2.getName() + " does not play in Super League"), s2)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testSetName(String names) {
        FootballClub club1 = new FootballClub();
        club1.setName(names);

        assertEquals(club1.getName(), names);
    }

    static Stream<String> testSetName() {
        return Stream.of("Club3", "Club2", "Club3");
    }

    @Test
    void setSquad() throws Exception {
        FootballClub club = new FootballClub();
        FootballPlayer player1 = new FootballPlayer();
        club.setBudget(BUDGET);
        player1.setPlayerPrice(PLAYER3_PRICE);

        club.setSquad(player1);
        club.setSquad(player1);
        club.buyPlayer(player1);

        assertEquals(club.getSquad().size(), 1);
    }
}