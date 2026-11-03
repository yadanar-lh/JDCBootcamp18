package linkedlist;

public class SingllyLinkedLIst {
    private Node head = null;

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next == null){
            current = current.next;
        }

        current.next = newNode;
    }

    //O(1)
    public int removeFromFirst(){
        Node removeNode = head;
        head = removeNode.next;
        removeNode.next = null;
        return removeNode.data;
    }

    public int removeFromLast(){
        Node removeNode = head;
        Node preRemoveNode = removeNode;
        while(removeNode.next == null){
            preRemoveNode = removeNode;
            removeNode = removeNode.next;
        }
        preRemoveNode.next = null;
        return removeNode.data;
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("Empty");
            return;
        }

        System.out.print("\nHead -> ");

        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null\n");
    }



}

