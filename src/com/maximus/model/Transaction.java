package com.maximus.model;

public class Transaction {
    private String currency;

    private int price;

    public Transaction(){}

    public Transaction(String currency, int price) {
        this.currency = currency;
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
