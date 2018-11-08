package com.epiuselabs.fivecarddraw.application;

import com.epiuselabs.fivecarddraw.application.core.PokerHand;
import com.epiuselabs.fivecarddraw.application.core.StandardDeck;
import com.epiuselabs.fivecarddraw.application.core.base.DeckOfCards;

/**
 * @author Ndumiso
 * @since 07-Nov-18
 */
public class FiveCardDrawApplication {

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new StandardDeck();
        deckOfCards.shuffle();
        PokerHand singleHand = (PokerHand) deckOfCards.dealCards(5);
        System.out.println("Your hand: " + singleHand);
        System.out.println("You have: " + singleHand.determineHandStrength());
    }
}
