package com.jdc;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapSample {
    static void main() {
        List<String> list1 = List.of("Mango","Banana","Apple");
        List<String> list2 = List.of("Chicken", "Fish","Pork" );
        Stream<List<String>> stream = Stream.of(list1,list2);
        stream.
                flatMap(i -> i.stream())
                        .forEach(System.out::println);

    }
}
