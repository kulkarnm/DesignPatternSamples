package com.patterns.chainofresponsibility;

public interface ProductPriceDeterminator {
    public double determineProductPrice(ProductDemandTrend productDemandTrend);
}
