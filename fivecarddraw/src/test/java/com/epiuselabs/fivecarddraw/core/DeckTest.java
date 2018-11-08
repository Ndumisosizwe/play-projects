package com.epiuselabs.fivecarddraw.core;

import com.epiuselabs.fivecarddraw.application.core.StandardDeck;
import com.epiuselabs.fivecarddraw.application.core.base.DeckOfCards;
import com.epiuselabs.fivecarddraw.application.exception.DeckValidationException;
import com.epiuselabs.fivecarddraw.application.value.Suit;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Ndumiso
 * @since 07-Nov-18
 */
public class DeckTest {

    private DeckOfCards deck;

    @Before
    public void setUp() throws Exception {
        this.deck = new StandardDeck();
    }

    @Test
    public void shouldPassIfDeckWasInitializedSuccessfully() {
        assertThat(this.deck.size()).isGreaterThan(0);
    }

    @Test
    public void testShouldPassIfEachSuitHas13Cards() {
        Arrays.stream(Suit.values()).forEach(suit -> {
            int sizeOfEachSuit = this.deck.getCards().stream()
                    .filter(card -> card.getSuit() == suit)
                    .collect(Collectors.toList()).size();
            if (sizeOfEachSuit != 13)
                throw new DeckValidationException("Invalid deck of cards");
        });

    }
}
