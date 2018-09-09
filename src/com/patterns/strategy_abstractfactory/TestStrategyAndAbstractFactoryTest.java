package com.patterns.strategy_abstractfactory;

import com.patterns.strategy_abstractfactory.calculator.Income;
import com.patterns.strategy_abstractfactory.calculator.IncomeTaxCalculator;
import com.patterns.strategy_abstractfactory.exemptions.ExemptionRule;
import com.patterns.strategy_abstractfactory.factory.IncomeTaxCalcProcessorsFactory;
import com.patterns.strategy_abstractfactory.factory.IncomeTaxCalculatorFactory;
import com.patterns.strategy_abstractfactory.factory.IndiaTaxCalcProcessorsFactory;
import com.patterns.strategy_abstractfactory.slab.SlabRule;

import java.util.HashMap;
import java.util.Map;

public class TestStrategyAndAbstractFactoryTest {
    public static void main(String [] args){
        Map<INSTRUMENT,Double> savingsInVariousInstruments = new HashMap<>();
        savingsInVariousInstruments.put(INSTRUMENT.HOUSING_LOAN,500000.00);
        savingsInVariousInstruments.put(INSTRUMENT.INVESTMENT_IN_LIFE_INSURANCE,200000.00);
        Income income = new Income(2000000,savingsInVariousInstruments);
        IncomeTaxCalcProcessorsFactory processorsFactory= new IndiaTaxCalcProcessorsFactory();
        ExemptionRule exemptionRule = processorsFactory.createExemptionRuleFactory().createExemptionRule();

        SlabRule slabRule = processorsFactory.createSlabRuleFactory().createSlabRule();
        IncomeTaxCalculatorFactory incomeTaxCalculatorFactory= processorsFactory.createIncomeTaxCalculatorFactory();
        IncomeTaxCalculator calculator = incomeTaxCalculatorFactory.createTaxCalculator();
        double tax = calculator.calculateIncomeTax(income,exemptionRule,slabRule);
        System.out.println("TAX IS : " + tax);

    }
} 
