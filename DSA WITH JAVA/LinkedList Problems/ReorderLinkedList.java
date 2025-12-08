public class ReorderLinkedList {
    public static void reorderlist(Node head) {
        // Partition
        Node s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        // Reverse 2nd Half
        Node a = s.next, b = s.next, c = null;
        s.next = null;
        while (b != null) {
            b = a.next;
            a.next = c;
            c = a;
            a = b;
        }
        // Merge With Head
        Node i = head, j = i.next, k = c;
        while (i != null && k != null) {
            i.next = k;
            k = k.next;
            i.next.next = j;
            i = j;
            j = j.next;
        }
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        System.out.println("Original list:");
        printList(head);

        reorderlist(head);

        System.out.println("List after reorderlist call:");
        printList(head);
    }
}
