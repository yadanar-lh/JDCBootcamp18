package com.jdc;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Rental> rentals = new ArrayList<>();

    public void addRental(Rental rental){
        rentals.add(rental);
    }
    private IRentalCost iRentalCost;

    public void setiRentalCost(IRentalCost iRentalCost) {
        this.iRentalCost = iRentalCost;
    }

    public int totalRentalCost(){
//        int total = 0;
//        for(Rental rental : rentals){
//            total += iRentalCost.totalRentalCost(rental.getDaysRented());
//
//        }
//        return total;

        return rentals.stream()
                .mapToInt(r -> iRentalCost.totalRentalCost(r.getDaysRented()))
                .sum();
    }

//    public int totalRentalCost(){
//        int total = 0;
//        for(Rental rental : rentals){
//            total += switch (rental.getMovie().getMovieType()){
//                case CHILDREN_MOVIE -> {
//                    if(rental.getDaysRented() <= 7){
//                        yield rental.getDaysRented() * 1;
//                    } else {
//                        yield (rental.getDaysRented() - 7) * 2 + 7;
//                    }
//                }
//                case REGULAR_MOVIE -> {
//                    if(rental.getDaysRented() <= 5){
//                        yield rental.getDaysRented() * 2;
//                    } else {
//                        yield (rental.getDaysRented() - 5) * 3 + 10;
//                    }
//                }
//                case NEW_RELEASE_MOVIE -> {
//                    if(rental.getDaysRented() <= 3){
//                        yield rental.getDaysRented() * 3;
//                    } else {
//                        yield (rental.getDaysRented() - 3) * 6 + 9;
//                    }
//                }
//
//            };
//        }
//        return total;
//    }

}
