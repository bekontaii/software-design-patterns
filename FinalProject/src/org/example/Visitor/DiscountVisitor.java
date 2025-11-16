package org.example.Visitor;

import org.example.model.Bike;
import org.example.model.Car;
import org.example.model.Van;

public class DiscountVisitor implements VehicleVisitor {

    @Override
    public void visit(Car car) {
        double discount = car.getBasePrice() * 0.05;
        System.out.println("Car discount: " + discount);
    }

    @Override
    public void visit(Bike bike) {
        double discount = bike.getBasePrice() * 0.10;
        System.out.println("Bike discount: " + discount);
    }

    @Override
    public void visit(Van van) {
        double discount = van.getBasePrice() * 0.02;
        System.out.println("Van discount: " + discount);
    }
}
