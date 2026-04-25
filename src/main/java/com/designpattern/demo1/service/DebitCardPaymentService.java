package com.designpattern.demo1.service;

import com.designpattern.demo1.dto.CreditCard;
import com.designpattern.demo1.service.validator.ValidatorService;
import com.designpattern.demo1.service.validator.ValidatorServiceImpl;

public class DebitCardPaymentService implements PaymentStrategy {

    ValidatorService validatorService = new ValidatorServiceImpl();

    @Override
    public double pay(CreditCard creditCard) {
        boolean valid = validatorService.validateCard(creditCard);
        return valid ? creditCard.getAmount() : null;
    }
}
