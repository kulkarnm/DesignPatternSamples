package com.patterns.command;

public class AuthenticationCommandArgument {
    private String userId;
    private String password;

    public AuthenticationCommandArgument(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }
}
