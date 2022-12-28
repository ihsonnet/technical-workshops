package com.unloadbrain.covid19bangladesh.exception;

public class IORuntimeException extends RuntimeException {

    public IORuntimeException(String message) {
        super(message);
    }

    public IORuntimeException(String message, Exception original) {
        super(message, original);
    }
}