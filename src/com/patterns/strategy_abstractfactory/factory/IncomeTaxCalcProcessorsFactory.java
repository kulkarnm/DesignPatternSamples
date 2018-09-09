package com.patterns.strategy_abstractfactory.factory;


public interface IncomeTaxCalcProcessorsFactory {
    public IncomeTaxCalculatorFactory createIncomeTaxCalculatorFactory();
    public ExemptionRuleFactory createExemptionRuleFactory();
    public SlabRuleFactory createSlabRuleFactory();
}
