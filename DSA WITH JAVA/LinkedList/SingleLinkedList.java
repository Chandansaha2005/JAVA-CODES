class LinkedList {
    Node head;
    Node tail;
    int size = 0;

    void addAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void addAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = tail = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
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
            size++;
        }
    }

    void deleteFromTail() {
        if (tail == null)
            System.out.println("Empty List");
        else {
            Node temp = head;
            while (temp.next != tail)
                temp = temp.next;
            tail = temp;
            temp.next = null;
        }
        if (tail == null)
            head = null;
        size--;
    }

    void deleteFromHead() {
        if (head == null)
            System.out.println("Empty List");
        else
            head = head.next;
        if (head == null)
            tail = null;
    }

    void deleteFromAny(int pos) {
        if (pos > size || pos < 1)
            System.out.println("WRONG POSITION\nEnter position between (1 to" + size + ")");
        if (pos == 1 || head == null)
            deleteFromHead();
        else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++)
                temp = temp.next;
            temp.next = temp.next.next;
        }
    }

    int search(int data) {
        int i = 1;
        for (Node temp = head; temp != null; temp = temp.next, ++i)
            if (temp.data == data)
                return i;
        return 0;
    }

    int get(int pos) {
        if (pos == 1)
            return head.data;
        if (pos == size)
            return tail.data;
        int i = 1;
        for (Node temp = head; temp != null; temp = temp.next, ++i)
            if (pos == i) {
                i = temp.data;
                break;
            }
        return i;
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
        System.out.println(ll.size);
        ll.addAtTail(10);
        ll.displayList();
        ll.addAtHead(30);
        ll.displayList();
        ll.addAtAny(50, 2);
        ll.displayList();
        System.out.println(ll.size);
        System.out.println((ll.search(30)));
        System.out.println(ll.get(2));
        // ll.deleteFromTail();
        // ll.displayList();
        // ll.deleteFromHead();
        // ll.displayList();
        // ll.deleteFromAny(2);
        // ll.displayList();
        // System.out.println(ll.size);

    }
}
