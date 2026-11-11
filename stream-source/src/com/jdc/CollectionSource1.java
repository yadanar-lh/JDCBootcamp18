package com.jdc;

import java.util.List;

record Order(String orderId, double amount, String status){}


public class CollectionSource1 {
    static void main() {
        List<Order> orders = List.of(
            new Order("ORD-12345", 120.5, "DELIVERED"),
            new Order("ORD-12346", 150.5, "PENDING"),
            new Order("ORD-12347", 200.4, "DELIVERED")
        );

        orders.stream()
                .filter(o -> o.status().equals("DELIVERED"))
                .forEach(System.out::println);
        ;
    }
}
