package org.example.model;

import org.example.Visitor.VehicleVisitor;

public class Car implements Vehicle {

    @Override
    public String getName() { return "Car"; }

    @Override
    public double getBasePrice() { return 100; }

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}
