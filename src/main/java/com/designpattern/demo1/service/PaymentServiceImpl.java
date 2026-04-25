package com.designpattern.demo1.service;

import com.designpattern.demo1.dto.CreditCard;

public class PaymentServiceImpl implements PaymentService {

    private PaymentFactory strategyFactory = new PaymentFactory();

    @Override
    public double pay(CreditCard card) {

        PaymentStrategy strategy = strategyFactory.getStrategy(card.getPaymentType());
        return strategy.pay(card);
    }
}
