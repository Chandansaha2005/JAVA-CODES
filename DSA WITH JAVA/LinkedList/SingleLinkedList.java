class LinkedList {
    Node head;
    Node tail;

    void addAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void addAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = tail = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class SingleLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.displayList();
        ll.addAtTail(20);
        ll.displayList();
        ll.addAtHead(30);
        ll.displayList();
    }
}
