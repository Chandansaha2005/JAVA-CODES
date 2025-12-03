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
        size++;
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
        size++;
    }

    void addAtAny(int data, int pos) {
        if (pos > size + 1 || pos < 1)
            System.out.println("WRONG POSITION\nEnter Position Between (1 to " + (size + 1) + ")");
        else if (pos == size + 1)
            addAtTail(data);
        else if (pos == 1)
            addAtHead(data);
        else {
            Dnode newNode = new Dnode(data);
            Dnode temp = head;
            for (int i = 2; i < pos; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            newNode.next.prev = newNode;
            size++;
        }
    }

    void deleteFromTail() {
        if (tail == null)
            System.out.println("Empty List");
        else if (tail == head) {
            head = tail = null;
            size--;
        } else {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    void deleteFromHead() {
        if (head == null)
            System.out.println("Empty List");
        else if (tail == head) {
            head = tail = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void deleteFromAny(int pos) {
        if (pos > size || pos < 1)
            System.out.println("WRONG POSITION\nEnter Position Between (1 to " + size + ")");
        else if (pos == size)
            deleteFromTail();
        else if (pos == 1)
            deleteFromHead();
        else {
            Dnode temp = head;
            for (int i = 2; i < pos; i++)
                temp = temp.next;
            temp.next = temp.next.next;
            temp.next.next.prev = temp;
        }
    }

    int search(int data) {
        int i = 1;
        for (Dnode temp = head; temp != null; temp = temp.next, ++i)
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
        for (Dnode temp = head; temp != null; temp = temp.next, ++i)
            if (pos == i) {
                i = temp.data;
                break;
            }
        return i;
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
        dlist.addAtAny(60, 2);
        dlist.displayList();
        dlist.deleteFromAny(6);
        dlist.displayList();
        System.out.println(dlist.get(2));
        // dlist.deleteFromTail();
        // dlist.displayList();
        // dlist.deleteFromTail();
        // dlist.displayList();
        // dlist.deleteFromHead();
        // dlist.displayList();
        // dlist.deleteFromHead();
        // dlist.displayList();
    }
}
