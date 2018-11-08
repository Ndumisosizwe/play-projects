package com.epiuselabs.fivecarddraw.application.core.base;

import com.epiuselabs.fivecarddraw.application.value.HandStrength;

/**
 * A hand of playing getCards.
 *
 * @author Ndumiso
 * @since 07-Nov-18
 */
public interface Hand {

    /**
     * Figures out what type of hand the player has got.
     *
     * @return The strength of the hand.
     */
    HandStrength getHighestPokerHand();

    boolean isStraightFlush();

    boolean isFourOfAKind();

    boolean isFoolHouse();

    boolean isFlush();

    boolean isStraight();

    boolean isThreeOfAKind();

    boolean isTwoPair();

    boolean isOnePair();

    boolean isHighCards();
}
