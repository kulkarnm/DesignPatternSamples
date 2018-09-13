package com.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {

    public static void main(String[] args) {
       // Request request = new Request("usr1","pw1",1L,2L,500);
        AuthenticateCommandReceiver authenticateCommandReceiver=AuthenticateCommandReceiver.getInstance();
        authenticateCommandReceiver.setCommandArgument(new AuthenticationCommandArgument("usr1","pw1"));

        TransferFundCommandReceiver transferFundCommandReceiver=TransferFundCommandReceiver.getInstance();
        transferFundCommandReceiver.setCommandArgument(new FundTransferCommandArgument(1L,2L,500));

        List<Command> commandList = new ArrayList<>();
        Command authenticateCommand = new AuthenticateCommand();
        Command transferFundCommand = new TransferFundCommand();
        commandList.add(authenticateCommand);
        commandList.add(transferFundCommand);

        for(Command command:commandList) {
            command.execute();
        }
    }

}
