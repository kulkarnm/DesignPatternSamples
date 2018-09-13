package com.patterns.chainofresponsibility;

public class DecreasedDemandIncreasedProfitDeterminator implements ProductPriceDeterminator {
    @Override
    public double determineProductPrice(String productId) {
        return 0;
    }
}
