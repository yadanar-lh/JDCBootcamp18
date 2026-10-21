package com.jdc;

public class TV extends Electronics{
    private int inches;

    public TV(String name, int quantity, double price, String manufacturer, int inches) {
        super(name, quantity, price, manufacturer);
        this.inches = inches;
    }

    @Override
    public double computeSalesPrice(){
        return getPrice()- (getPrice() * 0.3);
    }
}
