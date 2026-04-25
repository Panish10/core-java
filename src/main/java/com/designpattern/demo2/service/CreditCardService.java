package com.designpattern.demo2.service;

import com.designpattern.demo2.model.CreditCard;

public class CreditCardService implements PaymentService {

    private CreditCard creditCard;

    public CreditCardService(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void pay(double amount) {
        System.out.println();
    }
}
