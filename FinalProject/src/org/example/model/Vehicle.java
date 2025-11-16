package org.example.model;

import org.example.Visitor.VehicleVisitor;

public interface Vehicle {
    String getName();
    double getBasePrice();

    void accept(VehicleVisitor visitor);
}
