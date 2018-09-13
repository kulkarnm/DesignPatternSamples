package com.patterns.command;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String insufficient_balance_in_source_account) {
        super(insufficient_balance_in_source_account);
    }
}
