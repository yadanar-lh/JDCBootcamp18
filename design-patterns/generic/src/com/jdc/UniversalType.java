package com.jdc;

import java.util.List;

public class UniversalType {
     void main() {
        List<Integer> il = List.of(1,2,3,4,5);
        List<String> sl = List.of("Hello!","Java","is","cool.");
        print(il);
        print(sl);
    }

   <T> void print(List<T> list){
        for(T t:list){
            System.out.println(t);
        }
    }
}
