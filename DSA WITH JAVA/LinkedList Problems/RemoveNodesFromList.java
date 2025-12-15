public class RemoveNodesFromList {
    public static ListNode removeNodes(ListNode head) {
        ListNode rev = reverse(head);
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int max = Integer.MIN_VALUE;

        ListNode i = rev;
        while (i != null) {
            if (i.val >= max) {
                max = i.val;
                temp.next = i;
                temp = i;
            }
            i = i.next;
        }
        temp.next = null;
        return reverse(result.next);
    }

    public static ListNode reverse(ListNode head) {
        ListNode c = head, f = head, p = null;
        while (f != null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }

    // utility to print list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example 1: [5,2,13,3,8]
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        System.out.println("Original list:");
        printList(head);

        ListNode result = removeNodes(head);

        System.out.println("Modified list:");
        printList(result);
    }
}
