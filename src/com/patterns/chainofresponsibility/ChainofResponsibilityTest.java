package com.patterns.chainofresponsibility;

public class ChainofResponsibilityTest {

    public static void main(String [] args){
        ProductMetrics productMetricsCurrent = ProductMetricsDAO.getInstance().findProductMetricsByProductIdAndPeriod("1",3,2018);
        ProductMetrics productMetricsPrevious = ProductMetricsDAO.getInstance().findProductMetricsByProductIdAndPeriod("1",2,2018);
        ProductDemandTrend productDemandTrend = new ProductDemandTrend(productMetricsCurrent,productMetricsPrevious);
        System.out.println("Current Price is :"+ productMetricsCurrent.getPrice());
        ProductPriceDeterminator productPriceDeterminator = new DecreasedDemandDecreasedProfitDeterminator(new DecreasedDemandIncreasedProfitDeterminator( new IncreasedDemandDecreasedProfitDeterminator(new IncreasedDemandIncreasedProfitDeterminator(null))));
        double newPrice = productPriceDeterminator.determineProductPrice(productDemandTrend);
        System.out.println("New Price is :" + newPrice);
    }
} 
