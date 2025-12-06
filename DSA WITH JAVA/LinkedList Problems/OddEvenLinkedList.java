public class OddEvenLinkedList {
    public static Node oddEvenList(Node head) {
        Node o = new Node(0);
        Node e = new Node(0);
        Node i = head, odd = o, even = e;
        while (i != null) {
            if (i.data % 2 == 0) {
                even.next = i;
                i = i.next;
                even = even.next;
            } else {
                odd.next = i;
                i = i.next;
                odd = odd.next;
            }
        }
        odd.next = null;
        even.next = o.next;
        return e.next;
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

        System.out.println("Original list:");
        printList(head);

        Node result = oddEvenList(head);

        System.out.println("List after oddEvenList call:");
        printList(result);
    }
}
