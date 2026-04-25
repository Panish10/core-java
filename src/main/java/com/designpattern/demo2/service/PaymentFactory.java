package com.designpattern.demo2.service;

public class PaymentFactory {

    private PaymentService service;

    public PaymentFactory(PaymentService service) {
        this.service = service;
    }

    public void pay(double amount) {
        service.pay(amount);
    }
}
