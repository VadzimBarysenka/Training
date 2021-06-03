package football;

public class FootballPlayer {
    public static int playerPrice;
    private String playerName;

    public FootballPlayer(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerPrice() {
        return playerPrice;
    }

    public void setPlayerPrice(int playerPrice) {
        this.playerPrice = playerPrice;
     }
}
