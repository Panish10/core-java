package com.designpattern.demo1.service;

import com.designpattern.demo1.dto.CreditCard;
import com.designpattern.demo1.dto.DebitCard;

public class PaymentFactory {

    /*private final static Map<String, PaymentStrategy> strategyMap = new HashMap() {{
        put("CREDIT_CARD", new CreditCardPaymentService());
        put("DEBIT_CARD", new DebitCardPaymentStrategy());
        put("UPI", "value2");
    }};*/

    public PaymentStrategy getStrategy(Object object) {
        if (object instanceof CreditCard) {
            return new CreditCardPaymentService();
        } else if (object instanceof DebitCard) {
            return new DebitCardPaymentService();
        } else {
            throw new IllegalArgumentException("Unsupported payment type: " + object);
        }
    }
}
