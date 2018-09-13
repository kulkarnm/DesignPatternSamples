package com.patterns.command;

public class AuthenticateCommand implements Command{
    private AuthenticateCommandReceiver authenticateCommandReceiver;
    public AuthenticateCommand(){
        this.authenticateCommandReceiver =AuthenticateCommandReceiver.getInstance();

    }
    @Override
    public void execute() {
        System.out.println("IN AuthenticateCommand execution");
        authenticateCommandReceiver.handleCommand();
    }


} 
