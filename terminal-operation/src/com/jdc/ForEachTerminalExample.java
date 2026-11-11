package com.jdc;

import java.util.List;

record PaymentEvent(int sequenceNo, String textId, double amount){}
public class ForEachTerminalExample {
    static void main() {
        List<PaymentEvent> events = List.of(
                new PaymentEvent(1,"TX-101",250.0),
                new PaymentEvent(2,"TX-102",450.0),
                new PaymentEvent(3,"TX-103",120.0),
                new PaymentEvent(4,"TX-104",900.0)
        );
        events.parallelStream().forEachOrdered(System.out::println);
    }
}
