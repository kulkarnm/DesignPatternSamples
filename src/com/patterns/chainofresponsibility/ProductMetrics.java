package com.patterns.chainofresponsibility;

public class ProductMetrics {
    private String productId;
    private double price;
    private double demand;
    private double profit;
    private int month;
    private int year;

    public ProductMetrics(String productId, double price,double demand, double profit, int month, int year) {
        this.productId = productId;
        this.price = price;
        this.demand = demand;
        this.profit = profit;
        this.month = month;
        this.year = year;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public double getDemand() {
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
