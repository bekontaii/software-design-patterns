public class BmwFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new Bmw();
    }
    @Override
    public Car createEngine(){
        return new Bmw();
    }
}
