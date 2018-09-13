package com.patterns.chainofresponsibility;

public class ProductMetrics {
    private String productId;
    private long demand;
    private double profit;
    private int month;
    private int year;

    public ProductMetrics(String productId, long demand, double profit, int month, int year) {
        this.productId = productId;
        this.demand = demand;
        this.profit = profit;
        this.month = month;
        this.year = year;
    }

    public String getProductId() {
        return productId;
    }

    public long getDemand() {
        return demand;
    }

    public double getProfit() {
        return profit;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
