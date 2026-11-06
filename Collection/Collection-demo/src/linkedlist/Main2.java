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
        list.addLast(1);
        list.addLast(2);
        list.display();
//        System.out.println("Remove First" + list.removeFirst());
//        list.display();
//        System.out.println("Remove First" + list.removeFirst());
//        list.display();
        System.out.println("Remove last : " + list.removeLast());
        list.display();
        System.out.println("Remove last : " + list.removeLast());
        list.display();

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addFirst(4);
        ad.addFirst(7);
        ad.addFirst(9);
        ad.addFirst(11);
        System.out.println(ad);
        ad.addLast(1);
        ad.addLast(2);
        System.out.println(ad);
        System.out.println("Remove First : " + ad.removeFirst());
        System.out.println(ad);
        System.out.println("Remove Last : " + ad.removeLast());
        System.out.println(ad);
    }
}
