package org.example.decorator;

public abstract class RentalDecorator implements Rental {
    protected final Rental rental;

    protected RentalDecorator(Rental rental) {
        this.rental = rental;
    }
}
