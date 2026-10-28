package com.jdc;

public class NewReleaseMovieRentalCost implements IRentalCost{
    @Override
    public int totalRentalCost(int daysRented) {
        int total = 0;
        if(daysRented <= 3){
           total += daysRented * 3;
        } else {
           total += (daysRented - 3) * 6 + 9;
        }
        return total;
    }
}
