package linkedlist;

import java.util.LinkedList;

public class Main {
    static void main() {
        SingllyLinkedLIst list = new SingllyLinkedLIst();
        list.addFirst(5);
        list.addFirst(2);
        list.addFirst(7);
        list.display();

        System.out.println("Remove First: " + list.removeFromFirst());
        list.display();

        list.addFirst(9);
        list.addLast(11);
        list.display();



        System.out.println("Remove Last: " + list.removeFromLast());
        list.display();

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(5);
        linkedList.addFirst(2);
        linkedList.addFirst(7);
        System.out.print("\n" + linkedList);
        linkedList.addLast(9);
        linkedList.addLast(11);


        System.out.println("\n" + linkedList);
        System.out.println(linkedList.removeFirst());
        System.out.println("\n" + linkedList);
        System.out.println(linkedList.removeLast());
        System.out.println("\n" + linkedList);
    }
}
