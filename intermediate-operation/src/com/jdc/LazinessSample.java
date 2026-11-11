package com.jdc;

import java.util.List;

public class LazinessSample {
    static void main() {
        List.of(1,2,3,4,5,6,7,8,9,10)
                .stream()
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("Filter::" + n))
                .map(n -> n * n)
                .peek(n -> System.out.println("Map::" + n))
                .limit(2)
                .forEach(System.out::println); // terminal operation, without it, doesn't work
    }
}
