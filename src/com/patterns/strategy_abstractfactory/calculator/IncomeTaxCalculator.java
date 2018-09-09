package com.patterns.strategy_abstractfactory.calculator;

import com.patterns.strategy_abstractfactory.exemptions.ExemptionRule;
import com.patterns.strategy_abstractfactory.slab.SlabRule;

public class IncomeTaxCalculator {

    public double calculateIncomeTax(Income income, ExemptionRule exemptionRule, SlabRule slabRule) {
        double deductibleAmount = exemptionRule.calculateDeductions(income);
        double taxableAmount = income.getTotalIncome() - deductibleAmount;
        return slabRule.calculateTaxAmount(taxableAmount);
    }
}
