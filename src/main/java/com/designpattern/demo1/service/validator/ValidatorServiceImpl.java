package com.designpattern.demo1.service.validator;

import com.designpattern.demo1.dto.CreditCard;

public class ValidatorServiceImpl implements ValidatorService {

    private static final double MAX_PAYMENT_AMOUNT = 10000.0;

    @Override
    public boolean validateCard(CreditCard request) {
        if (request.getAmount() > MAX_PAYMENT_AMOUNT) {
            throw new IllegalArgumentException("Payment amount exceeds the INR " + MAX_PAYMENT_AMOUNT + " limit");
        }
        return true;
    }
}
