package com.jdc;

import java.util.List;

public class ListTerminalExample {
    static void main() {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evens = list.stream()
                .filter(s-> s % 2 == 0)
                .toList();

        evens.forEach(System.out::println);
    }
}
