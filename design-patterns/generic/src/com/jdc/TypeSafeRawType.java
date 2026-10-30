package com.jdc;

import java.util.ArrayList;

/*
Why Generics?

1. To type safe
2. Type abstraction
 */

public class TypeSafeRawType<T> {
    T num;
    static void main() {
        ArrayList<Integer> iList = new ArrayList<>();
//        ArrayList list = iList; raw
        ArrayList<Integer> list = iList;
        list.add(1);
//        list.add("Hello");
        int num = (int) list.get(0); //or int num = ilist.get(1), because same object
        System.out.println(num);
    }
}
