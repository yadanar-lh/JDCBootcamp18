package com.jdc;

import java.util.stream.Stream;

public class InfiniteStreamExample {
    static void main() {
        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);

    }
}
