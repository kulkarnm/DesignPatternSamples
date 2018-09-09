package com.patterns.strategy_abstractfactory.factory;

import com.patterns.strategy_abstractfactory.calculator.IncomeTaxCalculator;

public interface IncomeTaxCalculatorFactory {
    public IncomeTaxCalculator createTaxCalculator();
} 
