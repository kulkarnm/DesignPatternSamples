package com.patterns.command;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private static UserDAO instance = new UserDAO();
    private static Map<String, User> usersMap;

    static {
        usersMap = new HashMap<>();
        usersMap.put("usr1", new User("usr1", "pw1"));
        usersMap.put("usr2", new User("usr2", "pw2"));
    }

    private UserDAO() {
    }

    public static UserDAO getInstance() {
        return instance;
    }

    public User findUserById(String userId) {
        return usersMap.get(userId);
    }

} 
