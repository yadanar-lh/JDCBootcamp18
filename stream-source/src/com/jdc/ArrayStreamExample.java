package com.jdc;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamExample {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        IntStream isStream = Arrays.stream(arr);
        isStream.filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .limit(3)
                .forEach(System.out::println);
    }
}
