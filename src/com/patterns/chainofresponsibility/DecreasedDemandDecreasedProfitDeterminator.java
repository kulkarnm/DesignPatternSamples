package com.patterns.chainofresponsibility;

public class DecreasedDemandDecreasedProfitDeterminator implements ProductPriceDeterminator {
    private ProductPriceDeterminator nextDeterminator;
    public DecreasedDemandDecreasedProfitDeterminator(ProductPriceDeterminator nextDeterminator){
        this.nextDeterminator= nextDeterminator;
    }
    @Override
    public double determineProductPrice(ProductDemandTrend productDemandTrend) {
        ProductMetrics productMetricsCurrent = productDemandTrend.getProductMetricsCurrent();
        ProductMetrics productMetricsPrevious = productDemandTrend.getProductMetricsPrevious();
        if(productMetricsCurrent.getDemand()< productMetricsPrevious.getDemand() && productMetricsCurrent.getProfit() < productMetricsPrevious.getProfit()){
            double newProductPrice = productMetricsCurrent.getPrice() - (productMetricsPrevious.getDemand()-productMetricsCurrent.getDemand())/productMetricsCurrent.getDemand();
            return newProductPrice;
        }else{
            if(null != nextDeterminator) {
                return nextDeterminator.determineProductPrice(productDemandTrend);
            }else{
                return productMetricsCurrent.getPrice();
            }

        }
    }
}
