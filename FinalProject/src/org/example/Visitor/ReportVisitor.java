package org.example.Visitor;
import org.example.model.Bike;
import org.example.model.Car;
import org.example.model.Van;

public class ReportVisitor implements VehicleVisitor {

    @Override
    public void visit(Car car) {
        System.out.println("[REPORT] Car:");
        System.out.println("Name: " + car.getName());
        System.out.println("Base Price: " + car.getBasePrice());
        System.out.println("---------------------");
    }

    @Override
    public void visit(Bike bike) {
        System.out.println("[REPORT] Bike:");
        System.out.println("Name: " + bike.getName());
        System.out.println("Base Price: " + bike.getBasePrice());
        System.out.println("---------------------");
    }

    @Override
    public void visit(Van van) {
        System.out.println("[REPORT] Van:");
        System.out.println("Name: " + van.getName());
        System.out.println("Base Price: " + van.getBasePrice());
        System.out.println("---------------------");
    }
}
