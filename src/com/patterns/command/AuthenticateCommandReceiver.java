package com.patterns.command;


public class AuthenticateCommandReceiver {
    private static AuthenticateCommandReceiver authenticateCommandReceiver= new AuthenticateCommandReceiver();
    private AuthenticationCommandArgument commandArgument;
    private AuthenticateCommandReceiver(){
    }
    public static AuthenticateCommandReceiver getInstance(){
        return authenticateCommandReceiver;
    }

    public void setCommandArgument(AuthenticationCommandArgument commandArgument){
        this.commandArgument=commandArgument;
    }
    public void handleCommand(){
        User user= UserDAO.getInstance().findUserById(commandArgument.getUserId());
        if(commandArgument.getPassword().equals(user.getPassword())){
            System.out.println("User authenticated");
        }else{
            throw new AuthenticationFailureException("Authentication failed");

        }
    }

} 
