package com.patterns.statepattern;

public class TrafficSystem {
    private State greenState;
    private State redState;
    private State yellowState;
    private State currentState;
    private State previousState;
    public TrafficSystem() {
        super();
        greenState = new Green(this, new GreenLight());
        redState = new Red(this, new RedLight());
        yellowState = new Yellow(this, new YellowLight());
        Reciever intial = new GreenLight();
        currentState = new Green(this, intial);
        previousState = new Green(this, intial);
    }
    public State getGreenState() {
        return greenState;
    }
    public void setGreenState(State greenState) {
        this.greenState = greenState;
    }
    public State getRedState() {
        return redState;
    }
    public void setRedState(State redState) {
        this.redState = redState;
    }
    public State getYellowState() {
        return yellowState;
    }
    public void setYellowState(State yellowState) {
        this.yellowState = yellowState;
    }
    public State getCurrentState() {
        return currentState;
    }
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
    public State getPreviousState() {
        return previousState;
    }
    public void setPreviousState(State previousState) {
        this.previousState = previousState;
    }
    public void changeState() {
        getCurrentState().changeState();
    }
    public void displayState() {
        getCurrentState().displayState();
    }
}