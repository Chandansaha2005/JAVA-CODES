class Dnode {
    int data;
    Dnode next;
    Dnode prev;

    Dnode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DLinkedList {
    Dnode head;
    Dnode tail;
    int size = 0;

    void addAtTail(int data) {
        Dnode newNode = new Dnode(data);
        if (tail == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void addAtHead(int data) {
        Dnode newNode = new Dnode(data);
        if (head == null)
            head = tail = newNode;
        else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    void deleteFromTail() {
        if (tail == null)
            System.out.println("Empty List");
        else if (tail == head)
            head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void deleteFromHead() {
        if (head == null)
            System.out.println("Empty List");
        else if (tail == head)
            head = tail = null;
        else {
            head = head.next;
            head.prev = null;
        }
    }

    void displayList() {
        for (Dnode temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
        System.out.println();
    }

    void displayListRev() {
        for (Dnode temp = tail; temp != null; temp = temp.prev)
            System.out.print(temp.data + " ");
        System.out.println();
    }

}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLinkedList dlist = new DLinkedList();
        dlist.addAtTail(10);
        dlist.displayList();
        dlist.addAtTail(20);
        dlist.displayList();
        dlist.addAtHead(40);
        dlist.displayList();
        dlist.addAtHead(50);
        dlist.displayList();
        dlist.deleteFromTail();
        dlist.displayList();
        dlist.deleteFromTail();
        dlist.displayList();
        dlist.deleteFromHead();
        dlist.displayList();
        dlist.deleteFromHead();
        dlist.displayList();
    }
}
