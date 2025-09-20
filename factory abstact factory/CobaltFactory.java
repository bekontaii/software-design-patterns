public class CobaltFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new Cobalt();
    }
    @Override
    public Car createEngine(){
        return new Cobalt();
    }
}
