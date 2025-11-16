package org.example.factory;

import org.example.model.Bike;
import org.example.model.Vehicle;

public class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}