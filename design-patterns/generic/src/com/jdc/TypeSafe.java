package com.jdc;

import java.util.ArrayList;
import java.util.Iterator;

public class TypeSafe {
    static void main() {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
       // list.add("Hello"); //type mismatch

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
//            int num = (int) itr.next(); no need to cast with generic
            int num = itr.next();
            System.out.println(num);
        }
    }
}
