package Visitor;

import CarTypes.Sedan;
import CarTypes.Truck;
import CarTypes.SUV;

public interface CarVisitor {
    void visit(Sedan sedan);
    void visit(Truck truck);
    void visit(SUV suv);
}
