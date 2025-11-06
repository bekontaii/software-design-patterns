package Visitors;

import CarTypes.SUV;
import CarTypes.Sedan;
import CarTypes.Truck;
import Visitor.CarVisitor;

public class InspectionVisitor implements CarVisitor {
    @Override
    public void visit(Sedan sedan) {
        System.out.println("Inspecting the Sedan...");
    }

    @Override
    public void visit(Truck truck) {
        System.out.println("Inspecting the Truck...");
    }

    @Override
    public void visit(SUV suv) {
        System.out.println("Inspecting the SUV...");
    }
}
