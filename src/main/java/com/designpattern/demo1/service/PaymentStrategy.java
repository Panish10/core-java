package com.designpattern.demo1.service;

import com.designpattern.demo1.dto.CreditCard;

public interface PaymentStrategy {
    double pay(CreditCard request);
}
