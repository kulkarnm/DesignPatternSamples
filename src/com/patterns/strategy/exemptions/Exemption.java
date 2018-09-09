package com.patterns.strategy.exemptions;

import com.patterns.strategy.INSTRUMENT;

public class Exemption {
    private int exemptionSequence;
    private INSTRUMENT instrument;
    private double exemptionPercentage;

    public Exemption(int exemptionSequence, INSTRUMENT instrument, double exemptionPercentage) {
        this.exemptionSequence = exemptionSequence;
        this.instrument = instrument;
        this.exemptionPercentage = exemptionPercentage;
    }

    public int getExemptionSequence() {
        return exemptionSequence;
    }

    public INSTRUMENT getInstrument() {
        return instrument;
    }

    public double getExemptionPercentage() {
        return exemptionPercentage;
    }
}
