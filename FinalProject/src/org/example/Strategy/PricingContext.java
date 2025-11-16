package org.example.Strategy;

public class PricingContext {

    private PricingStrategy strategy;

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(double basePrice, int hours) {
        return strategy.calculatePrice(basePrice, hours);
    }
}
