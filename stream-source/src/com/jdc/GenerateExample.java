package com.jdc;

import java.util.UUID;
import java.util.stream.Stream;

public class GenerateExample {
    static void main() {
        Stream.generate(() -> UUID.randomUUID().toString().substring(0,8))
                .limit(5)
                .map(code -> "TNT-"+ code)
                .forEach(System.out::println);
    }
}
