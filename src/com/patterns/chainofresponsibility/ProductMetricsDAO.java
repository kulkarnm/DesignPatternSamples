package com.patterns.chainofresponsibility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMetricsDAO {
    private static ProductMetricsDAO instance = new ProductMetricsDAO();
    private static List<ProductMetrics> productMetricsList;

    static {
        productMetricsList = new ArrayList<>();
        productMetricsList.add(new ProductMetrics("1", 2000,200000,1,2018));
        productMetricsList.add(new ProductMetrics("1", 3000,300000,2,2018));
        productMetricsList.add(new ProductMetrics("1", 3800,350000,3,2018));

        productMetricsList.add(new ProductMetrics("2", 5000,500000,1,2018));
        productMetricsList.add(new ProductMetrics("2", 4500,450000,2,2018));
        productMetricsList.add(new ProductMetrics("2", 4000,400000,3,2018));

    }

    private ProductMetricsDAO(){

    }

    public ProductMetricsDAO getInstance(){
        return instance;
    }

    public ProductMetrics findProductMetricsByProductIdAndPeriod(String productId,int month,int year){
        return productMetricsList.stream().filter(pm->pm.getProductId().equals(productId) && pm.getMonth()==month && pm.getYear()==year).findFirst().get();
    }
} 
