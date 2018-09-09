package com.patterns.strategy_abstractfactory.factory;

import com.patterns.strategy_abstractfactory.slab.SlabRule;
import com.patterns.strategy_abstractfactory.slab.TaxSlab;
import com.patterns.strategy_abstractfactory.slab.UKSlabRule;

import java.util.ArrayList;
import java.util.List;

public class UKSlabRuleFactory implements SlabRuleFactory {
        @Override
        public SlabRule createSlabRule() {
            List<TaxSlab> slabList= new ArrayList<>();
            slabList.add(new TaxSlab(0,25000,0.05));
            slabList.add(new TaxSlab(25001,50000,0.10));
            slabList.add(new TaxSlab(50001,100000,0.15));
            slabList.add(new TaxSlab(100001,500000,0.2));
            return new UKSlabRule(slabList);
        }
}
