package linkedlist;

import java.util.ArrayDeque;

public class Main2 {
    static void main() {
        DoublyLInkedList list = new DoublyLInkedList();
        list.addFirst(4);
        list.addFirst(7);
        list.addFirst(9);
        list.addFirst(11);
        list.display();

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addFirst(4);
        ad.addFirst(7);
        ad.addFirst(9);
        ad.addFirst(11);
        System.out.println(ad);
    }
}
