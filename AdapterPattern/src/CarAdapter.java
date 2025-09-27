class CarAdapter implements Car {
    private  OldCarSystem oldCarSystem;
    public CarAdapter(OldCarSystem oldCarSystem) {
        this.oldCarSystem = oldCarSystem;
    }
    @Override
    public void drive() {
        oldCarSystem.moveCar();
    }
}
