package football;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FootballClubTest {
    private static final String CLUB_NAME = "FC Club";
    private static final int BUDGET = 110;
    private static final int EXPECTED_BUDGET = 130;
    private static final String PLAYER_NAME = "coolplayer";
    private static final int PLAYER_ONE_PRICE = 20;
    private static final int PLAYER_TWO_PRICE = 122;
    private static final int PLAYER_THREE_PRICE = 12;
    private static final int TITLES = 10;
    private static final int CLUB_TITLES1 = 9;
    private static final int TEAM_SIZE = 1;


    @Test
    void buyPlayerEnoughBudget() {
        FootballClub club = new FootballClub();
        club.setBudget(BUDGET);
        FootballPlayer player = new FootballPlayer();
        player.setPlayerPrice(PLAYER_ONE_PRICE);
        int RESULT = BUDGET - PLAYER_ONE_PRICE;

        club.buyPlayer(player);

        assertEquals(RESULT, club.getBudget());
    }

    @Test
    void buyPlayerNotEnoughBudget() {
        FootballClub club = new FootballClub();
        club.setName(CLUB_NAME);
        club.setBudget(BUDGET);
        FootballPlayer player2 = new FootballPlayer();
        player2.setPlayerName(PLAYER_NAME);
        player2.setPlayerPrice(PLAYER_TWO_PRICE);

        Exception exception = Assertions.assertThrows(RuntimeException.class,
                () -> club.buyPlayer(player2));
        assertEquals((club.getName() + " has no money to buy " + player2.getPlayerName()), exception.getMessage());
    }

    @Test
    void sellExistingPlayerTest() {
        FootballClub club = new FootballClub();
        club.setBudget(BUDGET);
        FootballPlayer player = new FootballPlayer();
        player.setPlayerPrice(PLAYER_ONE_PRICE);
        Set<FootballPlayer> team = new HashSet<>();
        team.add(player);
        club.setSquad(team);

        club.sellPlayer(player);

        assertEquals(EXPECTED_BUDGET, club.getBudget());
    }

    @Test
    void sellNotExistingPlayerTest() {
        FootballClub club = new FootballClub();
        club.setBudget(BUDGET);
        FootballPlayer player1 = new FootballPlayer();
        player1.setPlayerPrice(PLAYER_ONE_PRICE);
        FootballPlayer player3 = new FootballPlayer();
        player3.setPlayerPrice(PLAYER_THREE_PRICE);
        Set<FootballPlayer> team = new HashSet<>();
        team.add(player3);
        club.setSquad(team);

        Exception exception = Assertions.assertThrows(RuntimeException.class,
                () -> club.sellPlayer(player1));
        assertEquals("no such player in the squad", exception.getMessage());
    }

    @Test
    void sellWhenNoPlayers() {
        FootballClub club = new FootballClub();
        club.setName(CLUB_NAME);
        club.setBudget(BUDGET);
        FootballPlayer player1 = new FootballPlayer();
        player1.setPlayerPrice(PLAYER_ONE_PRICE);

        Exception exception = Assertions.assertThrows(RuntimeException.class,
                () -> club.sellPlayer(player1));
        assertEquals((club.getName() + " has no players"), exception.getMessage());
    }

    @Test
    void playTitle() {
        FootballClub club = new FootballClub();
        club.setBudget(BUDGET);
        club.setTitleNumber(CLUB_TITLES1);

        club.playTitle();

        assertEquals(club.getTitleNumber(), TITLES);

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
    void setSquad() {
        FootballClub club = new FootballClub();
        club.setBudget(BUDGET);
        FootballPlayer player1 = new FootballPlayer();
        player1.setPlayerName(PLAYER_NAME);
        player1.setPlayerPrice(PLAYER_THREE_PRICE);
        FootballPlayer player2 = new FootballPlayer();
        player2.setPlayerName(PLAYER_NAME);
        player2.setPlayerPrice(PLAYER_THREE_PRICE);

        club.buyPlayer(player1);
        club.buyPlayer(player2);

        assertEquals(TEAM_SIZE, club.getSquad().size());
    }
}