package org.example.Strategy;

public class DailyPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(double basePrice, int hours) {
        double days = Math.ceil(hours / 24.0);
        return basePrice * days;
    }
}
