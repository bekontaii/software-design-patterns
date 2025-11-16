package org.example.Strategy;

public interface PricingStrategy {
    double calculatePrice(double basePrice, int hours);
}
