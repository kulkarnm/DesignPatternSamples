package com.patterns.decorator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mandar on 20-10-2016.
 */
public class AccountDAO {
    private static AccountDAO instance = new AccountDAO();
    private static Map<Long, Account> accountsMap;

    static {
        accountsMap = new HashMap<>();
        accountsMap.put(1L, new Account(1, 2000));
        accountsMap.put(2L, new Account(2, 3000));
    }

    private AccountDAO() {
    }

    public static AccountDAO getInstance() {
        return instance;
    }

    public Account findAccountById(long accountId) {
        return accountsMap.get(accountId);
    }
}
