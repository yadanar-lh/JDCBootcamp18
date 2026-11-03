package com.jdc;

public class Truck extends Car{
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice(){
        double salePrice = getRegularPrice();
        if(weight > 2000){
            salePrice = salePrice  * 0.9;
        } else {
            salePrice = salePrice * 0.8;
        }
        return salePrice;
    }
}
