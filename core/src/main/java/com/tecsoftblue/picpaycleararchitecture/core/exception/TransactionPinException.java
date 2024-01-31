package com.tecsoftblue.picpaycleararchitecture.core.exception;

public class TransactionPinException extends Exception{

    private String code;

    public TransactionPinException(String message, String code) {
        super(message);
        this.code = code;
    }
}
