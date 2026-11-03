package com.jdc;

public class Sedan extends Car{
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice(){
        double salePrice = getRegularPrice();
        if(length > 20){
            salePrice = salePrice * 0.95;
        } else {
            salePrice = salePrice * 0.9;
        }
        return salePrice;
    }
}
