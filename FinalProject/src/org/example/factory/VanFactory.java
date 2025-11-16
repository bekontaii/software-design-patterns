package org.example.factory;

import org.example.model.Van;
import org.example.model.Vehicle;

public class VanFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Van();
    }
}
