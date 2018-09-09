package com.patterns.strategy_abstractfactory.factory;

import com.patterns.strategy_abstractfactory.INSTRUMENT;
import com.patterns.strategy_abstractfactory.exemptions.Exemption;
import com.patterns.strategy_abstractfactory.exemptions.ExemptionRule;
import com.patterns.strategy_abstractfactory.exemptions.UKExemptionRule;

import java.util.ArrayList;
import java.util.List;

public class UKExemptionRuleFactory implements ExemptionRuleFactory{
    public ExemptionRule createExemptionRule(){
        List<Exemption> exemptionRules= new ArrayList<>();
        Exemption exemption1 = new Exemption(1, INSTRUMENT.INVESTMENT_IN_PENSION_SCHEME,0.05);
        Exemption exemption2 = new Exemption(2,INSTRUMENT.INVESTMENT_IN_LIFE_INSURANCE,0.10);
        exemptionRules.add(exemption1);
        exemptionRules.add(exemption2);
        return new UKExemptionRule(exemptionRules);
    }
} 
