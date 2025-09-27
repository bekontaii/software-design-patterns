public  class  Main {
    public static void main(String[] args) {
        Car Bmw= new Bmw();
        Car Mercedes = new Mercedes();
        Bmw.drive();
        Mercedes.drive();

        System.out.println("---- Using the old system via an adapter ----");
        OldCarSystem oldCarSystem = new OldCarSystem();

        Car adaptedCar=new CarAdapter(oldCarSystem);
        adaptedCar.drive();

    }
}