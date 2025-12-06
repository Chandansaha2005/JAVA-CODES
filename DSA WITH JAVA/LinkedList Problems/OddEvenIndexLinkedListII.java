public class OddEvenIndexLinkedListII {
    public static ListNode oddEvenList(ListNode head) {
        ListNode o = new ListNode(0);
        ListNode e = new ListNode(0);
        ListNode i = head, odd = o, even = e;
        while (i != null) {
            if (i.val % 2 == 0) {
                even.next = i;
                i = i.next;
                even = even.next;
            } else {
                odd.next = i;
                i = i.next;
                odd = odd.next;
            }
        }
        even.next = null;
        odd.next = e.next;
        return o.next;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        ListNode result = oddEvenList(head);

        System.out.println("List after oddEvenList call:");
        printList(result);
    }
}
