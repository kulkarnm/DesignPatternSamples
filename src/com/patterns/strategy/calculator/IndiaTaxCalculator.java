package com.patterns.strategy.calculator;

import com.patterns.strategy.exemptions.ExemptionRule;
import com.patterns.strategy.slab.SlabRule;

public class IndiaTaxCalculator extends IncomeTaxCalculator {
    @Override
    public double calculateIncomeTax(Income income, ExemptionRule exemptionRule, SlabRule slabRule) {
        System.out.println("$$$$$ IN IndiaTAx Calculator $$$$");
        double deductibleAmount = exemptionRule.calculateDeductions(income);
        double taxableAmount = income.getTotalIncome() - deductibleAmount;
        return slabRule.calculateTaxAmount(taxableAmount);
    }

} 
