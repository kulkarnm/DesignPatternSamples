package com.patterns.strategy_templatemethod.exemptions;

import com.patterns.strategy_templatemethod.INSTRUMENT;
import com.patterns.strategy_templatemethod.calculator.Income;

import java.util.List;
import java.util.Map;

public class IndiaExemptionRule extends ExemptionRule {

    public IndiaExemptionRule(List<Exemption> exemptions) {
        super(exemptions);
    }
    @Override
    public double calculateDeductions(Income income){
        System.out.println(" $$$ IN India exemptions calculations");
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
