package org.example.Strategy;

public class HourlyPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(double basePrice, int hours) {
        return basePrice * hours;
    }
}
