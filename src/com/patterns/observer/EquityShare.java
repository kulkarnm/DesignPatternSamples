package com.patterns.observer;

import java.util.Observable;

public class EquityShare extends Observable {
    private double valuePerUnit;

    public double getValuePerUnit() {return valuePerUnit;}

    public void setValuePerUnit(double valuePerUnit) {
        this.valuePerUnit = valuePerUnit;
        setChanged();
        notifyObservers();
    }

} 
