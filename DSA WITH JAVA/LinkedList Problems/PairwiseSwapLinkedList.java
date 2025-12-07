public class PairwiseSwapLinkedList {
    public static Node pairwiseSwap(Node head) {
        if (head == null || head.next == null)
            return head;

        Node oddDummy = new Node(0), evenDummy = new Node(0);
        Node odd = oddDummy, even = evenDummy;
        Node curr = head;
        int idx = 1;

        while (curr != null) {
            if (idx % 2 != 0) {
                odd.next = curr;
                odd = odd.next;
            } else {
                even.next = curr;
                even = even.next;
            }
            curr = curr.next;
            idx++;
        }
        odd.next = null;
        even.next = null;

        Node resDummy = new Node(0);
        Node tail = resDummy;
        Node o = oddDummy.next, e = evenDummy.next;

        while (o != null || e != null) {
            if (e != null) {
                tail.next = e;
                tail = tail.next;
                e = e.next;
            }
            if (o != null) {
                tail.next = o;
                tail = tail.next;
                o = o.next;
            }
        }
        tail.next = null;
        return resDummy.next;
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

        Node result = pairwiseSwap(head);

        System.out.println("List after pairwiseSwap call:");
        printList(result);
    }
}
