package org.example.adapter;

public class PaymentAdapter {

    private final ExternalPaymentService service;

    public PaymentAdapter(ExternalPaymentService service) {
        this.service = service;
    }

    public void pay(double amount) {
        service.processExternalPayment(amount);
    }
}
