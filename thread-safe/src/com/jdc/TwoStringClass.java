package com.jdc;

import java.time.Duration;

public class TwoStringClass {
    public void printTwoString(String str1, String str2) {
        System.out.print(str1);
        try {
            Thread.sleep(Duration.ofSeconds(1));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(str2);
    }

}
