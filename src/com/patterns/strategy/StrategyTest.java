package com.patterns.strategy;

import com.patterns.strategy.calculator.Income;
import com.patterns.strategy.calculator.IncomeTaxCalculator;
import com.patterns.strategy.exemptions.ExemptionRule;
import com.patterns.strategy.exemptions.IndiaExemptionRule;
import com.patterns.strategy.slab.IndiaSlabRule;
import com.patterns.strategy.slab.SlabRule;
import com.patterns.strategy.exemptions.Exemption;
import com.patterns.strategy.slab.TaxSlab;
import com.patterns.strategy.calculator.IndiaTaxCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StrategyTest {
    public static void main(String [] args){
        Map<INSTRUMENT,Double> savingsInVariousInstruments = new HashMap<>();
        savingsInVariousInstruments.put(INSTRUMENT.HOUSING_LOAN,500000.00);
        savingsInVariousInstruments.put(INSTRUMENT.INVESTMENT_IN_LIFE_INSURANCE,200000.00);
        Income income = new Income(2000000,savingsInVariousInstruments);

        List<Exemption> exemptionRules= new ArrayList<>();
        Exemption exemption1 = new Exemption(1,INSTRUMENT.HOUSING_LOAN,0.2);
        Exemption exemption2 = new Exemption(2,INSTRUMENT.INVESTMENT_IN_LIFE_INSURANCE,0.15);
        exemptionRules.add(exemption1);
        exemptionRules.add(exemption2);
        ExemptionRule exemptionRule = new IndiaExemptionRule(exemptionRules);


        List<TaxSlab> slabList= new ArrayList<>();
        slabList.add(new TaxSlab(0,250000,0.1));
        slabList.add(new TaxSlab(250001,500000,0.15));
        slabList.add(new TaxSlab(500000,5000000,0.3));

        SlabRule slabRule = new IndiaSlabRule(slabList);

        IncomeTaxCalculator calculator = new IndiaTaxCalculator();
        double tax = calculator.calculateIncomeTax(income,exemptionRule,slabRule);
        System.out.println("TAX IS : " + tax);

    }
} 
