package com.patterns.statepattern;

public class GreenLight implements Reciever {
    @Override
    public void on() {
        System.out.println("Swithcing on green light");
    }
    @Override
    public void off() {
        System.out.println("Swithcing off green light");
    }
}