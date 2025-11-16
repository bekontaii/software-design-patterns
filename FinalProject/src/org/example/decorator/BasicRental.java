package org.example.decorator;
import org.example.Strategy.PricingContext;
import org.example.Strategy.PricingStrategy;
import org.example.model.Vehicle;

public class BasicRental implements Rental {
    private final Vehicle vehicle;

    public BasicRental(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public double getCost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Rental for " + vehicle.getClass().getSimpleName();
    }

    public double getCostWithStrategy(PricingStrategy strategy, int hours) {
        PricingContext context = new PricingContext();
        context.setStrategy(strategy);

        return context.getPrice(vehicle.getBasePrice(), hours);
    }

}