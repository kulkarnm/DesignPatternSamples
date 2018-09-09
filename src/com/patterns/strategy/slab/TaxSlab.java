package com.patterns.strategy.slab;

public class TaxSlab {
    private double minIncome;
    private double maxIncome;
    private double slabPercentage;

    public TaxSlab(double minIncome, double maxIncome, double slabPercentage) {
        this.minIncome = minIncome;
        this.maxIncome = maxIncome;
        this.slabPercentage = slabPercentage;
    }

    public double getMinIncome() {
        return minIncome;
    }

    public double getMaxIncome() {
        return maxIncome;
    }

    public double getSlabPercentage() {
        return slabPercentage;
    }
}
