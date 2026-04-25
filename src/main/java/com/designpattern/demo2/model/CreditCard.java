package com.designpattern.demo2.model;

public class CreditCard {

    private String cardNumber;
    private String expiryMonthYear;
    private String name;
    private String cvv;
    private double amount;
    private String paymentType;

    public CreditCard(String cardNumber, String expiryMonthYear, String name, String cvv, double amount, String paymentType) {
        this.cardNumber = cardNumber;
        this.expiryMonthYear = expiryMonthYear;
        this.name = name;
        this.cvv = cvv;
        this.amount = amount;
        this.paymentType = paymentType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryMonthYear() {
        return expiryMonthYear;
    }

    public void setExpiryMonthYear(String expiryMonthYear) {
        this.expiryMonthYear = expiryMonthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
