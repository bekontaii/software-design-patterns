package org.example.decorator;

public class InsuranceDecorator extends RentalDecorator {

    public InsuranceDecorator(Rental rental) {
        super(rental);
    }

    @Override
    public double getCost() {
        return rental.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return rental.getDescription() + ", with insurance";
    }
}