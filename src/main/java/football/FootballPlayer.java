package football;

import java.util.Objects;

public class FootballPlayer {
    private String playerName;
    private int playerPrice;

    public FootballPlayer() {
        playerName = "DefaultPlayer";
    }

    public int getPlayerPrice() {
        return playerPrice;
    }

    public void setPlayerPrice(int playerPrice) {
        this.playerPrice = playerPrice;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballPlayer player = (FootballPlayer) o;
        return playerPrice == player.playerPrice && Objects.equals(playerName, player.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, playerPrice);
    }
}
