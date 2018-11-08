package com.epiuselabs.fivecarddraw.application.core;

import com.epiuselabs.fivecarddraw.application.core.base.AbstractCardHand;
import com.epiuselabs.fivecarddraw.application.value.HandStrength;

import java.util.Set;

/**
 * xs
 *
 * @author Ndumiso
 * @since 07-Nov-18
 */
public class PokerHand extends AbstractCardHand {

    public PokerHand(Set<PlayingCard> cards) {
        super(cards);
    }

    @Override
    public HandStrength getHighestPokerHand() {
        if (isStraightFlush()) {
            return HandStrength.STRAIGHT_FLUSH;
        }
        return HandStrength.STRAIGHT_FLUSH;
    }

    @Override
    public boolean isStraightFlush() {
        return this.isSequential() && this.hasTheSameSuitOnAllCards();
    }

    @Override
    public boolean isFourOfAKind() {
        return false;
    }

    @Override
    public boolean isFoolHouse() {
        return false;
    }

    @Override
    public boolean isFlush() {
        return false;
    }

    @Override
    public boolean isStraight() {
        return false;
    }

    @Override
    public boolean isThreeOfAKind() {
        return false;
    }

    @Override
    public boolean isTwoPair() {
        return false;
    }

    @Override
    public boolean isOnePair() {
        return false;
    }

    @Override
    public boolean isHighCards() {
        return false;
    }


}
