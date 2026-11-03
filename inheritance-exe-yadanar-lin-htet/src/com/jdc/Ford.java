package com.jdc;

public class Ford extends Car{
    private int year;
    private int manufactureDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;
    }

    @Override
    public double getSalePrice(){
        double salePrice = getRegularPrice();
        salePrice -= manufactureDiscount;
        return salePrice;
    }
}
