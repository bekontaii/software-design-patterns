package org.example.Visitor;

import org.example.model.Bike;
import org.example.model.Car;
import org.example.model.Van;

public interface VehicleVisitor {
    void visit(Car car);
    void visit(Bike bike);
    void visit(Van van);
}
