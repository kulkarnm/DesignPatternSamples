package com.patterns.chainofresponsibility;

public class DecreasedDemandDecreasedProfitDeterminator implements ProductPriceDeterminator {
    @Override
    public double determineProductPrice(String productId) {
        return 0;
    }
}
