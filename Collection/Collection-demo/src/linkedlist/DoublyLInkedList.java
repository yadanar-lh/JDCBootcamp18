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

    public int removeFirst(){
        if(head == null){
            System.out.println("Empty List");
            return -1;
        }
        Node removeNode = head;
        if(head == tail){
            head = tail = null;
        } else {

            head = removeNode.next;
            removeNode.next.prev = null;
        }
        return removeNode.data;
    }

    public int removeLast(){
        if(tail== null){
            System.out.println("Empty List");
            return -1;
        }
       Node removeNode = tail;
        if(head == tail){
            head = tail = null;
        } else {
            tail = removeNode.prev;
            removeNode.prev.next = null;
        }
        return removeNode.data;
    }

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

    public void addLast(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
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
