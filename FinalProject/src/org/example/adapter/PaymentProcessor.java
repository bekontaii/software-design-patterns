package org.example.adapter;

public class PaymentProcessor {

    private final PaymentAdapter adapter;

    public PaymentProcessor(PaymentAdapter adapter) {
        this.adapter = adapter;
    }

    public void processPayment(double amount) {
        adapter.pay(amount);
    }
}
