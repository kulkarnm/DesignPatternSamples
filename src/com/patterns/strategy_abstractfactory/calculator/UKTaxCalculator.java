package com.patterns.strategy_abstractfactory.calculator;

import com.patterns.strategy_abstractfactory.exemptions.ExemptionRule;
import com.patterns.strategy_abstractfactory.slab.SlabRule;

public class UKTaxCalculator extends IncomeTaxCalculator {
    @Override
    public double calculateIncomeTax(Income income, ExemptionRule exemptionRule, SlabRule slabRule) {
        System.out.println("$$$$$ IN UK Tax Calculator $$$$");
        double deductibleAmount = exemptionRule.calculateDeductions(income);
        double taxableAmount = income.getTotalIncome() - deductibleAmount;
        return slabRule.calculateTaxAmount(taxableAmount);
    }

} 
