package Decorator;

public class Main {
    public static void main(String[] args) {
        Car basic = new BasicCar();
        System.out.println("Basic:");
        basic.assemble();

        System.out.println("\n\nSport Car:");
        Car sports = new SportCar(new BasicCar());
        sports.assemble();

        System.out.println("\n\nLuxury Sport Car:");
        Car luxurySports = new LuxuryCar(new SportCar(new BasicCar()));
        luxurySports.assemble();
    }
}
