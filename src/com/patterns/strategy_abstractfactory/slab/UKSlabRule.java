package com.patterns.strategy_abstractfactory.slab;

import java.util.List;

public class UKSlabRule extends SlabRule {
    public UKSlabRule(List<TaxSlab> taxSlabs) {
        super(taxSlabs);
    }

    @Override
    public double calculateTaxAmount(double taxableAmount){
        System.out.println("$$$$$ IN UK Slab calculations");
        TaxSlab taxSlab = this.findSlabForTheTaxableAmount(taxableAmount);
        return taxableAmount*taxSlab.getSlabPercentage();
    }

}
