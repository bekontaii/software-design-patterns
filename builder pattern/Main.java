public class Main {
    public static void main(String[] args) {
        Cars car1=new Cars.CarsBuilder()
                .setName("bmw")
                .setColor("black")
                .setModel("M5")
                .build();
        Cars car2=new Cars.CarsBuilder()
                .setName("Cobalt")
                        .build();
        System.out.println(car1);
        System.out.println(car2);
    }
}