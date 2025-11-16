package org.example.model;

import org.example.Visitor.VehicleVisitor;

public class Van implements Vehicle {

    @Override
    public String getName() { return "Van"; }

    @Override
    public double getBasePrice() { return 150; }

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}
