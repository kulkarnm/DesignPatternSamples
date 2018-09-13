package com.patterns.chainofresponsibility;

public interface ProductPriceDeterminator {
    public double determineProductPrice(String productId,int month,int year);
}
