package com.patterns.statepattern;

public class Green implements State {
    private TrafficSystem trafficSystem;
    private Reciever reciever;
    public Green(TrafficSystem trafficSystem, Reciever reciever) {
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
        trafficSystem.setPreviousState(this);
        trafficSystem.setCurrentState(trafficSystem.getYellowState());
    }
    @Override
    public void displayState() {
        reciever.on();
    }
}