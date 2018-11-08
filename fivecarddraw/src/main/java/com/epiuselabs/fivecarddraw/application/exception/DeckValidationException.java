package com.epiuselabs.fivecarddraw.application.exception;

/**
 * @author Ndumiso
 * @since 07-Nov-18
 */
public class DeckValidationException extends FiveCardDrawException {

    public DeckValidationException() {
    }

    public DeckValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeckValidationException(String message) {
        super(message);
    }
}
