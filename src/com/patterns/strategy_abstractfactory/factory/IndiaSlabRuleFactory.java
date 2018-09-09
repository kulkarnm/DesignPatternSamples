package com.patterns.strategy_abstractfactory.factory;

import com.patterns.strategy_abstractfactory.slab.IndiaSlabRule;
import com.patterns.strategy_abstractfactory.slab.SlabRule;
import com.patterns.strategy_abstractfactory.slab.TaxSlab;

import java.util.ArrayList;
import java.util.List;

public class IndiaSlabRuleFactory implements SlabRuleFactory {
    @Override
    public SlabRule createSlabRule() {
        List<TaxSlab> slabList= new ArrayList<>();
        slabList.add(new TaxSlab(0,250000,0.1));
        slabList.add(new TaxSlab(250001,500000,0.15));
        slabList.add(new TaxSlab(500000,5000000,0.3));
        return new IndiaSlabRule(slabList);
    }
}
