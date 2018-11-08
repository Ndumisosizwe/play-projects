package com.epiuselabs.fivecarddraw.core;

import com.epiuselabs.fivecarddraw.application.core.PlayingCard;
import com.epiuselabs.fivecarddraw.application.core.PokerHand;
import com.epiuselabs.fivecarddraw.application.value.CardRank;
import com.epiuselabs.fivecarddraw.application.value.Suit;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author Ndumiso
 * @since 08-Nov-18
 */
public class HandTest {

    Set<PlayingCard> cards;

    @Before
    public void setUp() throws Exception {
        cards = new TreeSet<>(
                Arrays.asList(new PlayingCard(CardRank.ACE, Suit.CLUBS), new PlayingCard(CardRank.TWO, Suit.CLUBS),
                        new PlayingCard(CardRank.THREE, Suit.CLUBS), new PlayingCard(CardRank.FOUR, Suit.CLUBS)
                ));
    }

    @Test
    public void testShouldPassIfIsStraightFlush() {
        assertThat(new PokerHand(cards).isStraightFlush()).isTrue();
    }

}
