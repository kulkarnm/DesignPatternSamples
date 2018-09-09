package com.patterns.strategy_abstractfactory.factory;

import com.patterns.strategy_abstractfactory.calculator.IncomeTaxCalculator;
import com.patterns.strategy_abstractfactory.calculator.UKTaxCalculator;

public class UKTaxCalculatorFactory implements IncomeTaxCalculatorFactory {
    @Override
    public IncomeTaxCalculator createTaxCalculator() {
        return new UKTaxCalculator();
    }
}
