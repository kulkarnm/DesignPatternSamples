package com.patterns.statepattern;

public class Yellow implements State {
    private TrafficSystem trafficSystem;
    private Reciever reciever;
    public Yellow(TrafficSystem trafficSystem, Reciever reciever) {
        super();
        this.trafficSystem = trafficSystem;
        this.reciever = reciever;
    }
    public TrafficSystem getTrafficSystem() {
        return trafficSystem;
    }
    public void setTrafficSystem(TrafficSystem trafficSystem) {
        this.trafficSystem = trafficSystem;
    }
    public Reciever getReciever() {
        return reciever;
    }
    public void setReciever(Reciever reciever) {
        this.reciever = reciever;
    }
    @Override
    public void changeState() {
        reciever.off();
        if (trafficSystem.getPreviousState() instanceof Green) {
            trafficSystem.setCurrentState(trafficSystem.getRedState());
        } else {
            trafficSystem.setCurrentState(trafficSystem.getGreenState());
        }
    }
    @Override
    public void displayState() {
        reciever.on();
    }
}