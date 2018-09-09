package com.patterns.strategy_abstractfactory.exemptions;

import com.patterns.strategy_abstractfactory.INSTRUMENT;
import com.patterns.strategy_abstractfactory.calculator.Income;

import java.util.List;
import java.util.Map;

public class UKExemptionRule extends ExemptionRule {
    public UKExemptionRule(List<Exemption> exemptions) {
        super(exemptions);
    }

    @Override
    public double calculateDeductions(Income income){
        System.out.println(" $$$ IN UK exemptions calculations");
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
