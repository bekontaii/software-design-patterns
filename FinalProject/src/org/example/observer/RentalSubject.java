package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class RentalSubject implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer obs : observers) {
            obs.update(message);
        }
    }

    public void rentalCreated(String vehicleName) {
        notifyObservers("Rental created for: " + vehicleName);
    }
}
