package cards;

public class Suit {
    private final int suit;

    public Suit(int suit) {
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        switch (suit){
            case 0: return "clubs";
            case 1: return "diamonds";
            case 2: return "hearts";
            case 3: return "spades";
            default: throw new IllegalArgumentException("Something went wrong " + suit + "is not a valid suitName!");
        }
    }
}
