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
        size++;
    }

    void addAtHead(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            head.next = tail;
            tail.next = head;
        } else {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
        size++;
    }

    void addAtAny(int data, int pos) {
        Node newNode = new Node(data);
        if (pos > size + 1 || pos < 1)
            System.out.println("WRONG POSITION\nEnter Position Between (1 to " + (size + 1) + ")");
        else if (pos == size + 1)
            addAtTail(data);
        else if (pos == 1 || head == null)
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
        if (tail == head)
            head = tail = null;
        else {
            Node temp = head;
            while (temp.next != tail)
                temp = temp.next;
            tail = temp;
            temp.next = head;
        }
        size--;
    }

    void deleteFromHead() {
        if (head == null)
            System.out.println("Empty List");
        if (head == tail)
            tail = head = null;
        else
            head = head.next;
        size--;
    }

    void deleteFromAny(int pos) {
        if (pos > size || pos < 1)
            System.out.println("WRONG POSITION\nEnter Position Between (1 to " + size + ")");
        else if (pos == 1 || head == tail)
            deleteFromHead();
        else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++)
                temp = temp.next;
            Node toDelete = temp.next;
            temp.next = toDelete.next;
            if (toDelete == tail)
                tail = temp;
            size--;
        }
    }

    void displayList() {
        Node temp = head;
        for (int i = 1; i <= size; i++, temp = temp.next)
            System.out.print(temp.data + " -> ");
        System.out.println();
    }
}

public class CircularLinkedlist {
    public static void main(String[] args) {
        CLinkedList clist = new CLinkedList();
        clist.addAtTail(10);
        clist.displayList();
        clist.addAtTail(20);
        clist.displayList();
        clist.addAtHead(30);
        clist.displayList();
        clist.addAtAny(50, 3);
        clist.displayList();
        clist.deleteFromTail();
        clist.displayList();
        clist.deleteFromHead();
        clist.displayList();
        clist.deleteFromAny(1);
        clist.displayList();
    }
}