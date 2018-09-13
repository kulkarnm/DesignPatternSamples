package com.patterns.command;

public class TransferFundCommand implements Command {
    private TransferFundCommandReceiver transferFundCommandReceiver;
    public TransferFundCommand(){
        this.transferFundCommandReceiver=TransferFundCommandReceiver.getInstance();
    }
    @Override
    public void execute() {
        System.out.println("IN TransferFundCommand execution");
        transferFundCommandReceiver.handleCommand();
    }
}
