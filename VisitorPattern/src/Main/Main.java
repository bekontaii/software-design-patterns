package Main;

import CarTypes.SUV;
import CarTypes.Sedan;
import CarTypes.Truck;
import Element.CarElement;
import Visitor.CarVisitor;
import Visitors.CarWashVisitor;
import Visitors.InspectionVisitor;

public class Main {
    public static void main(String[] args) {
        CarElement sedan = new Sedan();
        CarElement truck = new Truck();
        CarElement suv = new SUV();

        CarVisitor washVisitor = new CarWashVisitor();
        CarVisitor inspectionVisitor = new InspectionVisitor();

        System.out.println("=== Car Wash Service ===");
        sedan.accept(washVisitor);
        truck.accept(washVisitor);
        suv.accept(washVisitor);

        System.out.println("\n=== Technical Inspection ===");
        sedan.accept(inspectionVisitor);
        truck.accept(inspectionVisitor);
        suv.accept(inspectionVisitor);
    }
}

