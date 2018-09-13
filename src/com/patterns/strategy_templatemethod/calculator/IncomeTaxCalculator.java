package com.patterns.strategy_templatemethod.calculator;

import com.patterns.strategy_templatemethod.exemptions.ExemptionRule;
import com.patterns.strategy_templatemethod.slab.SlabRule;

public class IncomeTaxCalculator {
    //template method
    public double calculateIncomeTax(Income income, ExemptionRule exemptionRule, SlabRule slabRule) {
        double deductibleAmount = exemptionRule.calculateDeductions(income);
        double taxableAmount = income.getTotalIncome() - deductibleAmount;
        return slabRule.calculateTaxAmount(taxableAmount);
    }
}
