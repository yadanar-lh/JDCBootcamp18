package com.jdc;

import java.util.List;

record OrderItem(String productName, int quantity, double unitPrice){}
record CustomerOrder(String orderId, List<OrderItem> items){}
public class FlatMapDemo {
    static void main() {
        List<CustomerOrder> orders = List.of(
                new CustomerOrder("ORD-123",List.of(
                        new OrderItem("Laptop", 1, 2000),
                        new OrderItem("USD-C Hub", 2,45)
                )),
                new CustomerOrder("ORD-124",List.of(
                        new OrderItem("Wireless Mouse", 1, 35),
                        new OrderItem("Laptop", 1, 1200)
                ))
        );

        double totalPrice = orders.stream()
                .flatMap(co -> co.items().stream())
                .mapToDouble(oi -> oi.quantity() * oi.unitPrice())
                .sum();
        System.out.println("Total : " + totalPrice);
    }

}
