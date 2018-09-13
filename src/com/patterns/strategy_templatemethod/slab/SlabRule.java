package com.patterns.strategy_templatemethod.slab;

import java.util.List;
import java.util.stream.Collectors;

public class SlabRule {
    private List<TaxSlab> taxSlabs;

    public SlabRule(List<TaxSlab> taxSlabs) {
        this.taxSlabs = taxSlabs;
    }

    public TaxSlab findSlabForTheTaxableAmount(double taxableAomunt){
        return taxSlabs.stream().filter(ts->ts.getMinIncome()<=taxableAomunt && ts.getMaxIncome()>taxableAomunt).collect(Collectors.toList()).get(0);
    }

    public double calculateTaxAmount(double taxableAmount){
        TaxSlab taxSlab = this.findSlabForTheTaxableAmount(taxableAmount);
        return taxableAmount*taxSlab.getSlabPercentage();
    }
}
