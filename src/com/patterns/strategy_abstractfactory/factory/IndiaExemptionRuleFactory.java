package com.patterns.strategy_abstractfactory.factory;

import com.patterns.strategy_abstractfactory.INSTRUMENT;
import com.patterns.strategy_abstractfactory.exemptions.Exemption;
import com.patterns.strategy_abstractfactory.exemptions.ExemptionRule;
import com.patterns.strategy_abstractfactory.exemptions.IndiaExemptionRule;

import java.util.ArrayList;
import java.util.List;

public class IndiaExemptionRuleFactory implements ExemptionRuleFactory{
    public ExemptionRule createExemptionRule(){
        List<Exemption> exemptionRules= new ArrayList<>();
        Exemption exemption1 = new Exemption(1,INSTRUMENT.HOUSING_LOAN,0.2);
        Exemption exemption2 = new Exemption(2,INSTRUMENT.INVESTMENT_IN_LIFE_INSURANCE,0.15);
        exemptionRules.add(exemption1);
        exemptionRules.add(exemption2);
        return new IndiaExemptionRule(exemptionRules);
    }

}
