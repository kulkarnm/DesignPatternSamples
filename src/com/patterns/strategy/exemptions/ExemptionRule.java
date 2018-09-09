package com.patterns.strategy.exemptions;

import com.patterns.strategy.INSTRUMENT;
import com.patterns.strategy.calculator.Income;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExemptionRule {
    private List<Exemption> exemptions;

    public ExemptionRule(List<Exemption> exemptions) {
        this.exemptions = exemptions;
    }

    public Exemption findByInstrument(INSTRUMENT instrument){
        return exemptions.stream().filter(exemption -> exemption.getInstrument()==instrument).collect(Collectors.toList()).get(0);
    }

    public double calculateDeductions(Income income){
        double deductibleAmount=0;
        Map<INSTRUMENT, Double> investmentsMade = income.getSavingsInVariousInstruments();
        for (Map.Entry<INSTRUMENT, Double> investmentEntry : investmentsMade.entrySet()) {
            Exemption exemption = this.findByInstrument(investmentEntry.getKey());
            double taxExemptionAmount = investmentEntry.getValue() * exemption.getExemptionPercentage();
            deductibleAmount += taxExemptionAmount;
        }
        return deductibleAmount;
    }

}
