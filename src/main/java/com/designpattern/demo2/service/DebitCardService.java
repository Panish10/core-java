package com.designpattern.demo2.service;

import com.designpattern.demo2.model.DebitCard;

public class DebitCardService implements PaymentService {

    private DebitCard debitCard;

    public DebitCardService(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    @Override
    public void pay(double amount) {
        System.out.println();
    }
}
