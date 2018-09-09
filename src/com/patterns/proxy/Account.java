package com.patterns.proxy;

public class Account {
    private final long accountId;
    private double balance;

    public Account(long accountId) {
        this.accountId = accountId;
    }

    public Account(long accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public long getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void debit( double amount){
        this.balance-=amount;
    }
    public void credit(double amount){
        this.balance +=balance;
    }
} 
