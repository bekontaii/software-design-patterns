package org.example.decorator;

public class GpsDecorator extends RentalDecorator {

    public GpsDecorator(Rental rental) {
        super(rental);
    }

    @Override
    public double getCost() {
        return rental.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return rental.getDescription() + ", with GPS";
    }
}
