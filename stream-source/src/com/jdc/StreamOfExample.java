package com.jdc;

import java.util.List;
import java.util.stream.Stream;

public class StreamOfExample {
    static void main() {

        List<String> list = List.of("Apple","Banana", "Mango"); //store data actually with collection
        Stream<String> stream = Stream.of("Apple","Banana", "Mango") //not storing data, just to calculate once,
                                                                            // stream only can be used as onced
                .filter(s -> s.startsWith("M"));
        stream.forEach(System.out::println);

//        stream.forEach(System.out::println); //error cuz only once for stream,

        list.forEach(System.out::println);

    }
}
