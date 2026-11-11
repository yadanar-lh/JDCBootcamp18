package com.jdc;

import java.util.stream.Stream;

public class StreamBuilderExample {
    static void main() {
        Stream<Object> stream = Stream.builder()
                .add("Apple")
                .add("Mango")
                .add("Banana")
                .build();
        stream.forEach(System.out::println);
    }
}
