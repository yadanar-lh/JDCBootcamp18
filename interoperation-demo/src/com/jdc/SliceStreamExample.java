package com.jdc;

import java.util.List;

record Transaction(String id, int amount){}
public class SliceStreamExample {
    static void main() {
        List<Transaction> transactions = List.of(
                new Transaction("T1",100),
                new Transaction("T2",200),
                new Transaction("T3",300),
                new Transaction("T4",400),
                new Transaction("T5",500),
                new Transaction("T5",120),
                new Transaction("T5",200),
                new Transaction("T6",600),
                new Transaction("T7",700)
        );

        System.out.println("Takewhile -> T -< 500");
        transactions.stream()
//                .takeWhile(t -> t.amount() < 500)
                .filter(t -> t.amount() < 500)
                .forEach(System.out::println);

    }
}
