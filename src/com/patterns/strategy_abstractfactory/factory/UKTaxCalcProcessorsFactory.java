package com.patterns.strategy_abstractfactory.factory;

public class UKTaxCalcProcessorsFactory implements IncomeTaxCalcProcessorsFactory {
    @Override
    public IncomeTaxCalculatorFactory createIncomeTaxCalculatorFactory() {
        return new UKTaxCalculatorFactory();
    }

    @Override
    public ExemptionRuleFactory createExemptionRuleFactory() {
        return new UKExemptionRuleFactory();
    }

    @Override
    public SlabRuleFactory createSlabRuleFactory() {
        return new UKSlabRuleFactory();
    }
}
