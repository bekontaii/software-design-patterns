package org.example.factory;

public class VehicleFactoryProvider {

    public VehicleFactory getFactory(String type) {
        switch (type.toUpperCase()) {
            case "CAR":
                return new CarFactory();
            case "BIKE":
                return new BikeFactory();
            case "VAN":
                return new VanFactory();
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
