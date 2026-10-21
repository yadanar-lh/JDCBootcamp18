package com.jdc;

public class Phone extends Electronics{
    private String color;

    public Phone(String name, int quantity, double price, String manufacturer, String color) {
        super(name, quantity, price, manufacturer);
        this.color = color;
    }

    @Override
    public double computeSalesPrice(){
        return getPrice() - (getPrice() * 0.1);
    }
}
