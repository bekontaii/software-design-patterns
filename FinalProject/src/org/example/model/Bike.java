package org.example.model;

import org.example.Visitor.VehicleVisitor;

public class Bike implements Vehicle {

    @Override
    public String getName() { return "Bike"; }

    @Override
    public double getBasePrice() { return 30; }

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}
