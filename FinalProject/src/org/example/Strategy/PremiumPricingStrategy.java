package org.example.Strategy;

public class PremiumPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(double basePrice, int hours) {
        return (basePrice * hours) * 1.5;
    }
}
