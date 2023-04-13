package com.adyen.examples.exception;

public class InvalidWebhookTypeException extends RuntimeException {

    public InvalidWebhookTypeException(String s) {
        super(s);
    }
}
