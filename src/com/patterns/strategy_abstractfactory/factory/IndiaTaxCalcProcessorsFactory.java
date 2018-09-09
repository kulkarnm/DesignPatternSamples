package com.patterns.strategy_abstractfactory.factory;

public class IndiaTaxCalcProcessorsFactory implements IncomeTaxCalcProcessorsFactory {
    @Override
    public IncomeTaxCalculatorFactory createIncomeTaxCalculatorFactory() {
        return new IndiaTaxCalculatorFactory();
    }

    @Override
    public ExemptionRuleFactory createExemptionRuleFactory() {
        return new IndiaExemptionRuleFactory();
    }

    @Override
    public SlabRuleFactory createSlabRuleFactory() {
        return new IndiaSlabRuleFactory();
    }
}
