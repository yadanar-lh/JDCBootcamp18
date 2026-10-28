package com.jdc;

public class RegularMovieRentalCost implements IRentalCost{
    @Override
    public int totalRentalCost(int daysRented) {
        int total = 0;
        if(daysRented <= 5){
            total += daysRented * 2;
        } else {
            total += (daysRented - 5) * 3 + 10;
        }
        return total;
    }
}
