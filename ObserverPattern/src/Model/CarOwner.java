package Model;

import Obserber.Observer;

public class CarOwner implements Observer {
    private String name;

    public CarOwner(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Dear " + name + ", message from Service Station: " + message);
    }
}
