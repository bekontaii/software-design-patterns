public class Main {
    public static void main(String[] args) {
//        Cars car1=new Cars.CarsBuilder()
//                .setName("Bmw")
//                .setColor("Black")
//                .setModel("M5")
//                .build();
//        Cars car2=new Cars.CarsBuilder()
//                .setName("Cobalt")
//                        .build();
//        System.out.println(car1);
//        System.out.println(car2);
        CarFactory bmwFactory=new BmwFactory();
        Car bmw=bmwFactory.createCar();
        Engine bmwEngine=new BmwEngine();
        bmw.drive();
        bmwEngine.start();
        System.out.println("-----");
        CarFactory cobaltFactory=new CobaltFactory();
        Car cobalt=cobaltFactory.createCar();
        Engine cobaltEngine=new CobaltEngine();
        cobalt.drive();
        cobaltEngine.start();


    }
}