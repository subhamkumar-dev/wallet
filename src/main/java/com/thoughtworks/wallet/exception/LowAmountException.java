package com.thoughtworks.wallet.exception;

public class LowAmountException extends Exception{
    public LowAmountException(String message) {
        super(message);
    }
}
