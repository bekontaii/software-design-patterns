package Service;

import Obserber.Observed;
import Obserber.Observer;

import java.util.ArrayList;
import java.util.List;

public class ServiceStation implements Observed {
    private List<Observer> carOwners = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.carOwners.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.carOwners.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : carOwners) {
            observer.update(message);
        }
    }

    public void carReady(String carModel) {
        String message = "Your " + carModel + " is ready for pickup!";
        notifyObservers(message);
    }
}
