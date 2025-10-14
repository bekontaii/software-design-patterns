package Decorator;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + Luxury features");
    }
}
