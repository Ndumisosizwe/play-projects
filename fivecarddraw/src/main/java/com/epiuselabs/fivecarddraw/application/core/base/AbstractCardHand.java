package com.epiuselabs.fivecarddraw.application.core.base;

import com.epiuselabs.fivecarddraw.application.core.PlayingCard;
import com.epiuselabs.fivecarddraw.application.exception.FiveCardDrawException;
import com.epiuselabs.fivecarddraw.application.value.CardRank;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

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
                    .collect(toList());
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

    protected boolean hasTheSameRankOnAllCards() {
        PlayingCard firstCard = this.getCards().stream().findFirst().get();
        for (PlayingCard c : this.getCards()) {
            if (c.getCardRank() != firstCard.getCardRank())
                return false;
        }
        return true;
    }

    protected boolean hasNumberOfPairsOfTheSameRank(int numberOfPairs) {
        Map<CardRank, List<PlayingCard>> groupedByRank = getHandGroupedByRank();
        return groupedByRank.values().stream().filter(sameRankGroup -> sameRankGroup.size() == 2).count() == numberOfPairs;
    }

    protected boolean hasOneTripletOfTheSameRank() {
        Map<CardRank, List<PlayingCard>> groupedByRank = getHandGroupedByRank();
        return groupedByRank.values().stream().filter(sameRankGroup -> sameRankGroup.size() == 3).count() == 1;
    }

    protected boolean hasFourOfTheSameRank() {
        return this.getHandGroupedByRank().values()
                .stream().filter(sameRankGroup -> sameRankGroup.size() == 4).count() == 1;
    }

    private Map<CardRank, List<PlayingCard>> getHandGroupedByRank() {
        return this.getCards().stream()
                .collect(groupingBy(PlayingCard::getCardRank));
    }

    protected boolean hasNumberOfDistinctRanks(int numberOfUniqueRanks) {
        return this.getHandGroupedByRank().values()
                .stream().filter(sameRankGroup -> sameRankGroup.size() == 1).count() == numberOfUniqueRanks;
    }


}
