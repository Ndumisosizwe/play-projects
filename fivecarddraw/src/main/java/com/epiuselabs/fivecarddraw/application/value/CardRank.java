package com.epiuselabs.fivecarddraw.application.value;

/**
 * @author Ndumiso
 * @since 07-Nov-18
 */
public enum CardRank {

    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    private Integer numericValue;

    CardRank(Integer numericValue) {
        this.numericValue = numericValue;
    }

    public int getNumericValue() {
        return numericValue;
    }
}
