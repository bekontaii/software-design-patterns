package Decorator;

public class SportCar extends CarDecorator{
    public SportCar(Car decoratedCar) {
        super(decoratedCar);
    }
    @Override
    public void  assemble() {
        super.assemble();
        System.out.println("+ Sports features");
    }
}
