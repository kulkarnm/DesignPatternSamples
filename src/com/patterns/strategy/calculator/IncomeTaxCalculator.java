package com.patterns.strategy.calculator;

import com.patterns.strategy.exemptions.ExemptionRule;
import com.patterns.strategy.slab.SlabRule;

public class IncomeTaxCalculator {

    public double calculateIncomeTax(Income income, ExemptionRule exemptionRule, SlabRule slabRule) {
        double deductibleAmount = exemptionRule.calculateDeductions(income);
        double taxableAmount = income.getTotalIncome() - deductibleAmount;
        return slabRule.calculateTaxAmount(taxableAmount);
    }
}
