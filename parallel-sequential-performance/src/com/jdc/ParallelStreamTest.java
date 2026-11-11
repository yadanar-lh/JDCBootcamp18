package com.jdc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamTest {
    static void main() {
        int largeNumbers = 10000000;
        int threadHold = 500000;
        List<Integer> ilist = new ArrayList<>();
        for(int i = 0; i<largeNumbers; i++){
            ilist.add(i);
        }
        long startTime = System.nanoTime();
        ilist.stream().filter(n -> n > threadHold);
        long endTime = System.nanoTime();
        System.out.println("Take Time in Sequential Stream: " + (endTime-startTime));

        startTime = System.nanoTime();
        ilist.parallelStream().filter(n -> n > threadHold);
        endTime = System.nanoTime();
        System.out.println("Take Time in Parallel Stream: " + (endTime-startTime));
    }
}
