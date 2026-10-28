package com.jdc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class CustomerTest {
    private Customer customer;

    //feature
    @BeforeEach //before each test, this executes
    public void init(){
        customer = new Customer();
    }

    @Test
    public void should_return_7_for_7_days_rent_children_movie(){
        customer.addRental(new Rental(7,new Movie(MovieType.CHILDREN_MOVIE,"Toys Story")));
        customer.setiRentalCost(new ChildrenMovieRentalCost());
        assertThat(customer.totalRentalCost(),equalTo(7));
    }

    @Test
    public void should_return_13_for_10_days_rent_children_movie(){
        customer.addRental(new Rental(10,new Movie(MovieType.CHILDREN_MOVIE,"Star Wars")));
        customer.setiRentalCost(new ChildrenMovieRentalCost());
        assertThat(customer.totalRentalCost(),equalTo(13));
    }

    @Test
    public void should_return_20_for_2_children_movies_rent(){
        customer.addRental(new Rental(7,new Movie(MovieType.CHILDREN_MOVIE,"Toys Story")));
        customer.addRental(new Rental(10,new Movie(MovieType.CHILDREN_MOVIE,"Star Wars")));
        customer.setiRentalCost(new ChildrenMovieRentalCost());
        assertThat(customer.totalRentalCost(),equalTo(20));
    }

    @Test
    public void should_return_10_for_5_days_rent_regular_movie(){
        customer.addRental(new Rental(5, new Movie(MovieType.REGULAR_MOVIE,"Wonder Woman")));
        customer.setiRentalCost(new RegularMovieRentalCost());
        assertThat(customer.totalRentalCost(),equalTo(10));
    }

    @Test
    public void should_return_16_for_7_days_rent_regular_movie(){
        customer.addRental(new Rental(7, new Movie(MovieType.REGULAR_MOVIE,"My Little Pony")));
        customer.setiRentalCost(new RegularMovieRentalCost());
        assertThat(customer.totalRentalCost(),equalTo(16));
    }

    @Test
    public void should_return_9_for_3_days_rent_new_release_movie(){
        customer.addRental(new Rental(3, new Movie(MovieType.NEW_RELEASE_MOVIE,"East of Eden")));
        customer.setiRentalCost(new NewReleaseMovieRentalCost());
        assertThat(customer.totalRentalCost(),equalTo(9));
    }

    @Test
    public void should_return_21_for_5_days_rent_new_release_movie(){
        customer.addRental(new Rental(5,new Movie(MovieType.NEW_RELEASE_MOVIE,"Monster High")));
        customer.setiRentalCost(new NewReleaseMovieRentalCost());
        assertThat(customer.totalRentalCost(),equalTo(21));
    }
}

