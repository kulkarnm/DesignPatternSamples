package com.patterns.chainofresponsibility;

public class ProductDemandTrend {
    private ProductMetrics productMetricsCurrent;
    private ProductMetrics productMetricsPrevious;

    public ProductDemandTrend(ProductMetrics productMetricsCurrent, ProductMetrics productMetricsPrevious) {
        this.productMetricsCurrent = productMetricsCurrent;
        this.productMetricsPrevious = productMetricsPrevious;
    }

    public ProductMetrics getProductMetricsCurrent() {
        return productMetricsCurrent;
    }

    public ProductMetrics getProductMetricsPrevious() {
        return productMetricsPrevious;
    }
}
