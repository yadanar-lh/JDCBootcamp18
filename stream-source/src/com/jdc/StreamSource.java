package com.jdc;

import java.util.List;

public class StreamSource {
    static void main() {
        List<String> list = List.of("Apple", "Mango","Banana");
        list.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);
    }
}
