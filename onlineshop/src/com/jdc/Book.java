package com.jdc;

import java.time.LocalDate;

public class Book extends Product{

    private String publisher;
    private LocalDate yearPublished;

    public Book(String name, int quantity, double price, String publisher, LocalDate yearPublished) {
        super(name, quantity, price);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }

    // 50% off
    public double computeSalesPrice(){
        return getPrice() * 0.5;
    }
}
