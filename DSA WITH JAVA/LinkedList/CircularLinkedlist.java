class CLinkedList {
    Node head;
    Node tail;
    int size = 0;

    void addAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            head.next = tail;
            tail.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }
}

public class CircularLinkedlist {
    
}