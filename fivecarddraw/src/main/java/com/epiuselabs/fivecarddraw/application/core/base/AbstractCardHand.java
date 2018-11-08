package com.epiuselabs.fivecarddraw.application.core.base;

import com.epiuselabs.fivecarddraw.application.core.PlayingCard;
import com.epiuselabs.fivecarddraw.application.exception.FiveCardDrawException;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Ndumiso
 * @since 07-Nov-18
 */
public abstract class AbstractCardHand implements Hand {

    private int size;

    private Set<PlayingCard> cards;

    public AbstractCardHand(Set<PlayingCard> cards) {
        this.size = cards.size();
        this.cards = cards;
    }

    protected int getSize() {
        return this.size;
    }

    protected Set<PlayingCard> getCards() {
        return this.cards;
    }

    @Override
    public String toString() {
        return cards + "";
    }

    protected boolean isSequential() {
        if (this.getSize() >= 2) {
            List<PlayingCard> hand = this.getCards()
                    .stream()
                    .sorted()
                    .collect(Collectors.toList());
            for (int i = 0; i < hand.size() - 1; i++) {
                int currentRank = hand.get(i).getCardRank().getNumericValue();
                int nextRank = hand.get(i + 1).getCardRank().getNumericValue();
                if ((currentRank + 1) != nextRank)
                    return false;
            }
        } else {
            throw new FiveCardDrawException("Invalid hand size.");
        }

        return true;
    }

    protected boolean hasTheSameSuitOnAllCards() {
        PlayingCard firstCard = this.getCards().stream().findFirst().get();
        for (PlayingCard c : this.getCards()) {
            if (c.getSuit() != firstCard.getSuit())
                return false;
        }
        return true;
    }

}
