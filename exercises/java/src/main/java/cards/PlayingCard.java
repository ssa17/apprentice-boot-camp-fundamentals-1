package cards;

public class PlayingCard {

    private final Suit suit;
    private int faceValue;

    public PlayingCard(Suit inSuit, int faceValue) {
        suit = new Suit(inSuit);
        this.faceValue = faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
