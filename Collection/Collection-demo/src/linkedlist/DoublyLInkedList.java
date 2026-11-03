package linkedlist;

public class DoublyLInkedList {
    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    private Node head = null;
    private Node tail = null;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        System.out.print("null");
        while(current != null){
            System.out.print(" <- " + current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
