package Facade;

public class CarPurchaseFacade {
    private PaymentService payment;
    private CarAssemblyService assembly;
    private DeliveryService delivery;

    public CarPurchaseFacade() {
        payment = new PaymentService();
        assembly = new CarAssemblyService();
        delivery = new DeliveryService();
    }

    public void purchaseCar() {
        System.out.println("Starting car purchase process...");
        payment.makePayment();
        assembly.assembleCar();
        delivery.deliverCar();
        System.out.println("Purchase completed successfully!");
    }
}

