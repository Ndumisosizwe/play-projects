package com.epiuselabs.fivecarddraw.core;

import com.epiuselabs.fivecarddraw.application.core.PlayingCard;
import com.epiuselabs.fivecarddraw.application.core.PokerHand;
import com.epiuselabs.fivecarddraw.application.value.CardRank;
import com.epiuselabs.fivecarddraw.application.value.Suit;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author Ndumiso
 * @since 08-Nov-18
 */
public class HandTest {

    Set<PlayingCard> cards;


    @Test
    public void shouldPassIfIsStraightFlush() {
        cards = new HashSet<>(
                Arrays.asList(new PlayingCard(CardRank.ACE, Suit.CLUBS), new PlayingCard(CardRank.TWO, Suit.CLUBS),
                        new PlayingCard(CardRank.THREE, Suit.CLUBS), new PlayingCard(CardRank.FOUR, Suit.CLUBS)));
        assertThat(new PokerHand(cards).isStraightFlush()).isTrue();
    }

    @Test
    public void shouldPassIfIsOnePair() {
        cards = new HashSet<>(
                Arrays.asList(new PlayingCard(CardRank.ACE, Suit.HEARTS), new PlayingCard(CardRank.ACE, Suit.SPADES),
                        new PlayingCard(CardRank.THREE, Suit.HEARTS), new PlayingCard(CardRank.FOUR, Suit.SPADES),
                        new PlayingCard(CardRank.FIVE, Suit.CLUBS)));
        assertThat(new PokerHand(cards).isOnePair()).isTrue();
    }

    @Test
    public void shouldPassIfIsHighCards() {
        cards = new HashSet<>(
                Arrays.asList(new PlayingCard(CardRank.ACE, Suit.HEARTS), new PlayingCard(CardRank.ACE, Suit.SPADES),
                        new PlayingCard(CardRank.THREE, Suit.HEARTS), new PlayingCard(CardRank.FOUR, Suit.SPADES),
                        new PlayingCard(CardRank.FIVE, Suit.CLUBS)));
        assertThat(new PokerHand(cards).isHighCards()).isTrue();
    }


    @Test
    public void shouldPassIfIsTwoPair() {
        cards = new HashSet<>(
                Arrays.asList(new PlayingCard(CardRank.ACE, Suit.HEARTS), new PlayingCard(CardRank.ACE, Suit.SPADES),
                        new PlayingCard(CardRank.THREE, Suit.HEARTS), new PlayingCard(CardRank.THREE, Suit.SPADES),
                        new PlayingCard(CardRank.FIVE, Suit.CLUBS)));
        assertThat(new PokerHand(cards).isTwoPair()).isTrue();
    }

    @Test
    public void shouldPassIfIsThreeOfAKind() {
        cards = new HashSet<>(
                Arrays.asList(new PlayingCard(CardRank.THREE, Suit.CLUBS), new PlayingCard(CardRank.SEVEN, Suit.HEARTS),
                        new PlayingCard(CardRank.SEVEN, Suit.CLUBS), new PlayingCard(CardRank.SEVEN, Suit.SPADES),
                        new PlayingCard(CardRank.KING, Suit.HEARTS)));
        assertThat(new PokerHand(cards).isThreeOfAKind()).isTrue();
    }

    @Test
    public void shouldPassIfIsStraight() {
        cards = new HashSet<>(
                Arrays.asList(new PlayingCard(CardRank.TEN, Suit.DIAMONDS), new PlayingCard(CardRank.NINE, Suit.SPADES),
                        new PlayingCard(CardRank.SEVEN, Suit.DIAMONDS), new PlayingCard(CardRank.EIGHT, Suit.HEARTS),
                        new PlayingCard(CardRank.SIX, Suit.CLUBS)));
        assertThat(new PokerHand(cards).isStraight()).isTrue();
    }


    @Test
    public void shouldPassIfIsFlush() {
        cards = new HashSet<>(
                Arrays.asList(new PlayingCard(CardRank.JACK, Suit.DIAMONDS), new PlayingCard(CardRank.NINE, Suit.DIAMONDS),
                        new PlayingCard(CardRank.EIGHT, Suit.DIAMONDS), new PlayingCard(CardRank.FOUR, Suit.DIAMONDS),
                        new PlayingCard(CardRank.THREE, Suit.DIAMONDS)));
        assertThat(new PokerHand(cards).isFlush()).isTrue();
    }

    @Test
    public void shouldPassIfIsFullHouse() {
        cards = new HashSet<>(
                Arrays.asList(new PlayingCard(CardRank.SIX, Suit.DIAMONDS), new PlayingCard(CardRank.SIX, Suit.CLUBS),
                        new PlayingCard(CardRank.SIX, Suit.HEARTS), new PlayingCard(CardRank.KING, Suit.HEARTS),
                        new PlayingCard(CardRank.KING, Suit.DIAMONDS)));
        assertThat(new PokerHand(cards).isFullHouse()).isTrue();
    }

    @Test
    public void shouldPassIfIsFourOfAKind() {
        cards = new HashSet<>(
                Arrays.asList(new PlayingCard(CardRank.ACE, Suit.CLUBS), new PlayingCard(CardRank.ACE, Suit.DIAMONDS),
                        new PlayingCard(CardRank.ACE, Suit.HEARTS), new PlayingCard(CardRank.ACE, Suit.SPADES),
                        new PlayingCard(CardRank.TWO, Suit.DIAMONDS)));
        assertThat(new PokerHand(cards).isFourOfAKind()).isTrue();
    }

}
