package com.patterns.strategy_abstractfactory.slab;

import java.util.List;

public class IndiaSlabRule extends SlabRule {
    public IndiaSlabRule(List<TaxSlab> taxSlabs) {
        super(taxSlabs);
    }
    @Override
    public double calculateTaxAmount(double taxableAmount){
        System.out.println("$$$$$ IN INida Slab calculations");
        TaxSlab taxSlab = this.findSlabForTheTaxableAmount(taxableAmount);
        return taxableAmount*taxSlab.getSlabPercentage();
    }

}
