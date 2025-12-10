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

public class ReverseDoublyLinkedList {
    public static Dnode reverse(Dnode head) {
        Dnode p = null, c = head, f = head;
        while (c != null) {
            f = c.next;
            c.next = p;
            c.prev = f;
            p = c;
            c = f;
        }
        return p;
    }

    public static void printList(Dnode head) {
        Dnode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Dnode head = new Dnode(3);
        Dnode second = new Dnode(4);
        Dnode third = new Dnode(5);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println("Original list:");
        printList(head);

        Dnode result = reverse(head);

        System.out.println("Reversed list:");
        printList(result);
    }
}
