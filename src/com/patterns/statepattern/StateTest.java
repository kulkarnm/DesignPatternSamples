package com.patterns.statepattern;

public class StateTest {
    public static void main(String[] args) throws InterruptedException {
        TrafficSystem trafficSystem = new TrafficSystem();
        while (true) {
            trafficSystem.displayState();
            if (trafficSystem.getCurrentState() instanceof Yellow) {
                Thread.sleep(5000);
            } else {
                Thread.sleep(15000);
            }
            trafficSystem.changeState();
        }
    }
} 
