package Main;

public class Main {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();

        CarOwner firstOwner=new CarOwner("Bekarys");
        CarOwner secondOwner=new CarOwner("Bob");
        CarOwner thirdOwner=new CarOwner("Davis");

        station.addObserver(firstOwner);
        station.addObserver(secondOwner);
        station.addObserver(thirdOwner);

        station.carReady("Mercedes CLS63");

        station.removeObserver(thirdOwner);

        station.carReady("BMW M5");
    }
}
