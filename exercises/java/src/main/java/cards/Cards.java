package cards;

public class Cards {

    private Suit suit = new Suit();

    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }


    public String[] getCards() {
        String[] result = new String[52];
        PlayingCard[] deck = new PlayingCard[52];


            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck[suit+faceValue] = new PlayingCard(suit, faceValue);
            }


        int cardNumber = 0;
        for (PlayingCard card : deck) {
            String faceValueName;
            switch (card.getFaceValue()){
                case 0: faceValueName = "ace"; break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: faceValueName = Integer.toString(card.getFaceValue()+1); break;
                case 10: faceValueName = "jack"; break;
                case 11: faceValueName = "queen"; break;
                case 12: faceValueName = "king"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card.getFaceValue() + "is not a valid faceValue!");
            }

            result[cardNumber] = faceValueName + " of " + card.getSuit();
            cardNumber++;
        }

        return result;
    }
}
