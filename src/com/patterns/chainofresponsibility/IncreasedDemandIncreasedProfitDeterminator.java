package com.patterns.chainofresponsibility;

public class IncreasedDemandIncreasedProfitDeterminator implements ProductPriceDeterminator {
    @Override
    public double determineProductPrice(String productId) {
        return 0;
    }
}
