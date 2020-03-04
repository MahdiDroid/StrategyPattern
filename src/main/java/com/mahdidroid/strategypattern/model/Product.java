package com.mahdidroid.strategypattern.model;

public class Product {

    private String upsCode;
    private int price;

    public Product(String upsCode, int price) {
        this.upsCode = upsCode;
        this.price = price;
    }

    public String getUpsCode() {
        return upsCode;
    }

    public void setUpsCode(String upsCode) {
        this.upsCode = upsCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
