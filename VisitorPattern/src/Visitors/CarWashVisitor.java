package Visitors;

import CarTypes.SUV;
import CarTypes.Sedan;
import CarTypes.Truck;
import Visitor.CarVisitor;

public class CarWashVisitor implements CarVisitor {
    @Override
    public void visit(Sedan sedan) {
        System.out.println("Washing the Sedan...");
    }

    @Override
    public void visit(Truck truck) {
        System.out.println("Washing the Truck...");
    }

    @Override
    public void visit(SUV suv) {
        System.out.println("Washing the SUV...");
    }
}
