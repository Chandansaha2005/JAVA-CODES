class CDLinkedList {
    Dnode head;
    Dnode tail;
    int size;

    void addAtTail(int data) {
        Dnode newNode = new Dnode(data);
        if (tail == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        tail.next = head;
        head.prev = tail;
        size++;
    }

    void addAtHead(int data) {
        Dnode newNode = new Dnode(data);
        if (head == null)
            head = tail = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        tail.next = head;
        head.prev = tail;
        size++;
    }

    void displayList() {
        Dnode temp = head;
        for (int i = 0; i < size; i++)
            System.out.print(temp.data + " -> ");
        System.out.println();
    }
}

public class CircularDoublyLinkedList {
    public static void main(String[] args) {
        CDLinkedList list = new CDLinkedList();
        list.addAtTail(10);
        list.displayList();
        System.out.println("Size = " + list.size);
        list.addAtHead(20);
        list.displayList();
        System.out.println("Size = " + list.size);
    }
}
