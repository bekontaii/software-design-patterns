package org.example.factory;

import org.example.model.Car;
import org.example.model.Vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}