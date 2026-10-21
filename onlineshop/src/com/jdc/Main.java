package com.jdc;

import java.time.LocalDate;

public class Main {
    static void main() {
        Product[] products = new Product[6];

        products[0] = new Book("Under the Greenwood Tree",12,50,
                "Sun", LocalDate.of(1897,11,12));

        products[1] = new Book("A Tale of Two Cities",10,70,
                "Moon",LocalDate.of(1989,11,12));

        products[2] = new Phone("IPhone 18 Pro",10,2000,
                "Apple","RedBrown");

        products[3] = new Phone("Samsung S25",10,2500,
                "Samsung","SkyBlue");

        products[4] = new TV("Samsung SmartTV",10,2000,
                "Samsung",60);

        products[5] = new TV("Sony", 15,2500,
                "Sony",90);

        double totalRegularSalesPrice = 0;
        double totalComputeSalesPrice = 0;

        for(int i = 0; i < products.length; i++){
            totalRegularSalesPrice += products[i].getPrice();
            totalComputeSalesPrice += products[i].computeSalesPrice();
            System.out.println("%s regular price: %s , compute sales price: %s"
                    .formatted(products[i].getName(),
                            products[i].getPrice(),
                            products[i].computeSalesPrice()));
        }

        System.out.println("Total Regular Sales Price: " + totalRegularSalesPrice);
        System.out.println("Total Compute Sales Price: " + totalComputeSalesPrice);
    }
}
