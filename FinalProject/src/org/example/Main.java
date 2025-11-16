package org.example;

import org.example.Strategy.HourlyPricingStrategy;
import org.example.Strategy.PremiumPricingStrategy;
import org.example.Strategy.PricingContext;

import org.example.Visitor.ReportVisitor;
import org.example.Visitor.VehicleVisitor;
import org.example.Visitor.DiscountVisitor;

import org.example.adapter.*;
import org.example.decorator.BasicRental;
import org.example.decorator.GpsDecorator;
import org.example.decorator.InsuranceDecorator;
import org.example.decorator.Rental;
import org.example.factory.VehicleFactoryProvider;
import org.example.model.Vehicle;
import org.example.observer.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== VEHICLE RENTAL SYSTEM DEMO =====\n");

        // ======================================
        // 1. FACTORY — создаём транспорт
        // ======================================
        VehicleFactoryProvider provider = new VehicleFactoryProvider();

        Vehicle car = provider.getFactory("CAR").createVehicle();
        Vehicle bike = provider.getFactory("BIKE").createVehicle();
        Vehicle van = provider.getFactory("VAN").createVehicle();

        System.out.println("Created vehicles:");
        System.out.println("- " + car.getName());
        System.out.println("- " + bike.getName());
        System.out.println("- " + van.getName());
        System.out.println("--------------------------------------\n");


        // ======================================
        // 2. DECORATOR — базовая аренда + услуги
        // ======================================
        Rental rental = new BasicRental(car);

        System.out.println("Base rental cost: " + rental.getCost());

        rental = new GpsDecorator(rental);
        rental = new InsuranceDecorator(rental);

        System.out.println("Rental cost with DECORATORS (GPS + Insurance): "
                + rental.getCost());
        System.out.println("--------------------------------------\n");


        // ======================================
        // 3. STRATEGY — расчёт стоимости по тарифу
        // ======================================
        PricingContext pricing = new PricingContext();

        pricing.setStrategy(new HourlyPricingStrategy());
        double hourly = pricing.getPrice(car.getBasePrice(), 5);

        System.out.println("Hourly Strategy (5 hours): " + hourly);

        pricing.setStrategy(new PremiumPricingStrategy());
        double premium = pricing.getPrice(car.getBasePrice(), 3);

        System.out.println("Premium Strategy (3 hours): " + premium);
        System.out.println("--------------------------------------\n");


        // ======================================
        // 4. ADAPTER — оплата аренды
        // ======================================
        ExternalPaymentService externalService = new ExternalPaymentService();
        PaymentAdapter adapter = new PaymentAdapter(externalService);
        PaymentProcessor processor = new PaymentProcessor(adapter);

        System.out.println("Processing payment using ADAPTER:");
        processor.processPayment(200.0);
        System.out.println("--------------------------------------\n");


        // ======================================
        // 5. OBSERVER — уведомления
        // ======================================
        RentalSubject subject = new RentalSubject();

        subject.addObserver(new AdminObserver());
        subject.addObserver(new CustomerObserver("Bekarys"));

        System.out.println("Sending OBSERVER notifications:");
        subject.notifyObservers("New rental has been created!");
        System.out.println("--------------------------------------\n");


        // ======================================
        // 6. VISITOR — отчёт и скидки
        // ======================================
        VehicleVisitor reportVisitor = new ReportVisitor();
        VehicleVisitor discountVisitor = new DiscountVisitor();

        System.out.println("VISITOR REPORT:");
        car.accept(reportVisitor);
        bike.accept(reportVisitor);
        van.accept(reportVisitor);

        System.out.println("VISITOR DISCOUNT:");
        car.accept(discountVisitor);
        bike.accept(discountVisitor);
        van.accept(discountVisitor);
        System.out.println("--------------------------------------\n");


        System.out.println("===== END OF DEMO =====");
    }
}
