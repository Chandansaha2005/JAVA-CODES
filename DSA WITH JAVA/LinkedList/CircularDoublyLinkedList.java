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


    void deleteFromTail() {
        if (tail == null) {
            System.out.println("Empty List");
            return;
        } else if (tail == head) {
            head = tail = null;
        } else {
            tail.prev.next = head;
            head.prev = tail.prev;
            tail = tail.prev;
        }
        size--;
    }

    void deleteFromHead() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        } else if (tail == head) {
            head = tail = null;
        } else {
            head.next.next = tail;
            tail.prev = head.next.next;
            head = head.next;
        }
        size--;
    }

    void displayList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Dnode temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
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

        list.addAtTail(30);
        list.displayList();
        System.out.println("Size = " + list.size);

        list.addAtHead(40);
        list.displayList();
        System.out.println("Size = " + list.size);

        list.deleteFromTail();
        list.displayList();
        System.out.println("Size = " + list.size);

        list.deleteFromHead();
        list.displayList();
        System.out.println("Size = " + list.size);
    }
}