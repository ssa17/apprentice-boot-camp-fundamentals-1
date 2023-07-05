package cards;

public class PlayingCard {

    private final int cardValue;
    private final String cardSuit;

    public PlayingCard(int cardValue, String cardSuit) {
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public String getCardSuit() {
        return cardSuit;
    }
}
