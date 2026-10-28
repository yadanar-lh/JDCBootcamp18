package com.jdc;

public class ChildrenMovieRentalCost implements IRentalCost{
    @Override
    public int totalRentalCost(int daysRented) {
        int total = 0;
        if(daysRented <= 7){
            total += daysRented * 1;
        } else {
            total += (daysRented - 7) * 2 + 7;
        }
        return total;
    }
}
