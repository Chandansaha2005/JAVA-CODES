public class RotateDoublyLinkedList {
    public Dnode rotateDLL(Dnode head, int p) {
        int size = 0;
        for (Dnode temp = head; temp != null; temp = temp.next) size++;
        p = p % size;
        if (p == 0) return head;
        Dnode t = head, tail = null, head2 = null, tail2 = null;
        int count = 1;
        while (t != null) {
            if (count == p)
                tail = t;
            if (count == p + 1)
                head2 = t;
            if (t.next == null)
                tail2 = t;
            t = t.next;
            count++;
        }
        tail2.next = head;
        head.prev = tail2;
        tail.next = null;
        head2.prev = null;
        return head2;
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
        Dnode head = new Dnode(1);
        Dnode second = new Dnode(2);
        Dnode third = new Dnode(3);
        Dnode fourth = new Dnode(4);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        System.out.println("Original list:");
        printList(head);

        RotateDoublyLinkedList rdl = new RotateDoublyLinkedList();
        Dnode result = rdl.rotateDLL(head, 2);

        System.out.println("List after rotateDLL call:");
        printList(result);
    }
}
