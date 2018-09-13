package com.patterns.command;

public class AuthenticationFailureException extends RuntimeException {
    public AuthenticationFailureException(String message){
        super(message);
    }
} 
