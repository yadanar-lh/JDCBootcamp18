package com.jdc;

public class Electronics extends Product{

    private String manufacturer;

    public Electronics(String name, int quantity, double price, String manufacturer) {
        super(name, quantity, price);
        this.manufacturer = manufacturer;
    }



}
