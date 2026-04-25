package com.designpattern.demo1.service;

import com.designpattern.demo1.dto.CreditCard;
import com.designpattern.demo1.service.validator.ValidatorService;
import com.designpattern.demo1.service.validator.ValidatorServiceImpl;

public class CreditCardPaymentService implements PaymentStrategy {

    ValidatorService validatorService = new ValidatorServiceImpl();

    @Override
    public double pay(CreditCard request) {
        boolean valid = validatorService.validateCard(request);
        return valid ? request.getAmount() : null;
    }
}
