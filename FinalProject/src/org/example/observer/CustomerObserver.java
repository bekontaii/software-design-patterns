package org.example.observer;

public class CustomerObserver implements Observer {
    private final String name;

    public CustomerObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Customer " + name + " received: " + message);
    }
}
