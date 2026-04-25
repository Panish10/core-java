package com.designpattern.demo1;

import com.designpattern.demo1.dto.CreditCard;
import com.designpattern.demo1.service.PaymentService;
import com.designpattern.demo1.service.PaymentServiceImpl;

public class MainClass {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentServiceImpl();
        double amount = paymentService.pay(prepareInputCreditCard());
        System.out.println("prepareInputCreditCard: " + amount);

        amount = paymentService.pay(prepareInputDebitCard());
        System.out.println("prepareInputDebitCard: " + amount);
    }

    private static CreditCard prepareInputCreditCard() {
        return new CreditCard("12345678", "12/32", "Panish", "123", 10000, "CREDIT_CARD");
    }

    private static CreditCard prepareInputDebitCard() {
        return new CreditCard("12345678", "12/32", "Panish", "123", 9000, "DEBIT_CARD");
    }
}
