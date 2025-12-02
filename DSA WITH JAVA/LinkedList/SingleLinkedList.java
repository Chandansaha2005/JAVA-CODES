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

    void addAtAny(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 1 || head == null)
            addAtHead(data);
        else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++)
                temp = temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void displayList() {
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " -> ");
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
        ll.addAtAny(50, 2);
        ll.displayList();
        ll.addAtAny(40, 1);
        ll.displayList();
    }
}
