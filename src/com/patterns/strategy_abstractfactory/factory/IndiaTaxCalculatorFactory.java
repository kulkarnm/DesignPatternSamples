package com.patterns.strategy_abstractfactory.factory;

import com.patterns.strategy_abstractfactory.calculator.IncomeTaxCalculator;
import com.patterns.strategy_abstractfactory.calculator.IndiaTaxCalculator;

public class IndiaTaxCalculatorFactory implements IncomeTaxCalculatorFactory {
    @Override
    public IncomeTaxCalculator createTaxCalculator() {
        return new IndiaTaxCalculator();
    }
}
