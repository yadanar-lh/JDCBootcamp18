package com.jdc;

import java.util.List;
import java.util.Locale;

record Product(String id, String name, String category, double price,boolean inStock){}
record ProductDto(String name,double discountPrice){}
public class FilterMapExample {
    static void main() {
        List<Product> inventory = List.of(
                new Product("PO1","Mechanical Keyboard","IT",120, true),
                new Product("P02","Gaming Mouse","IT",60, false),
                new Product("P03","27-inch Monitor","IT",300,true),
                new Product("P04","Office Chair","Furniture",180, true)
        );

        inventory
                .stream()
                .filter(p -> p.inStock() & "IT".equals(p.category()))
                .map(p -> new ProductDto(p.name().toUpperCase(),
                        p.price() * 0.9))
                .forEach(System.out::println);
    }
}
