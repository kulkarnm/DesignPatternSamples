package com.patterns.observer;

public class TestObserver {
    public static void main(String[] args){
        EquityShare equityShare = new EquityShare();

        EquitySubscriber subscriber = new EquitySubscriber();

        equityShare.addObserver(subscriber);

        equityShare.setValuePerUnit(400.00);
    }
} 
