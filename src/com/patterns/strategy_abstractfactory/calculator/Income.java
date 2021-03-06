package com.patterns.strategy_abstractfactory.calculator;

import com.patterns.strategy_abstractfactory.INSTRUMENT;

import java.util.Map;

public class Income {
    private double totalIncome;
    private Map<INSTRUMENT,Double> savingsInVariousInstruments;

    public Income(double totalIncome, Map<INSTRUMENT, Double> savingsInVariousInstruments) {
        this.totalIncome = totalIncome;
        this.savingsInVariousInstruments = savingsInVariousInstruments;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public Map<INSTRUMENT, Double> getSavingsInVariousInstruments() {
        return savingsInVariousInstruments;
    }
}
