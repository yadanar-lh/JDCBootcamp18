package com.jdc;

import java.util.List;

public class ReduceExample {
    static void main() {
        List<Integer> iList = List.of(1,2,3,4,5,6,7,8,9);

        int sum = iList.stream()
                .filter(s -> s % 2 == 0)
                .limit(2)
                .reduce(1, (a,b) -> a * b);
        System.out.println(sum);
    }
}
