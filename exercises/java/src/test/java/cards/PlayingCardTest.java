package cards;

import junit.framework.TestCase;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PlayingCardTest extends TestCase {

    @Test
    public void testGivenCard_returnCardValue() {
        PlayingCard playingCard = new PlayingCard(1, "spade");

        assertThat(playingCard.getCardValue()).isEqualTo(1);
    }

    @Test
    public void testGivenCard_returnCardSuit() {
        PlayingCard playingCard = new PlayingCard(1, "spade");

        assertThat(playingCard.getCardSuit()).isEqualTo("spade");
    }
}