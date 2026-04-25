package com.designpattern.demo2;


import com.designpattern.demo2.model.CreditCard;
import com.designpattern.demo2.service.CreditCardService;
import com.designpattern.demo2.service.PaymentFactory;
import com.designpattern.demo2.service.PaymentService;

public class Main {

    public static void main(String[] args) {
        PaymentService service = null;

        service = (PaymentService) new PaymentFactory(new CreditCardService(prepareInputCreditCard()));
        //service.pay();
    }

    private static CreditCard prepareInputCreditCard() {
        return new CreditCard("12345678", "12/32", "Panish", "123", 10000, "CREDIT_CARD");
    }

    private static CreditCard prepareInputDebitCard() {
        return new CreditCard("12345678", "12/32", "Panish", "123", 9000, "DEBIT_CARD");
    }
}
