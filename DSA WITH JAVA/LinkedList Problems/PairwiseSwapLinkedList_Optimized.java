public class PairwiseSwapLinkedList_Optimized {
    public static ListNode pairwiseSwap(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode res = new ListNode(0);
        ListNode a = head, b = head.next, c = res;
        while (a != null && b != null) {
            c.next = b;
            a.next = b.next;
            b.next = a;
            c = a;
            a = a.next;
            if (a != null)
                b = a.next;
        }
        return res.next;
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

        ListNode result = pairwiseSwap(head);

        System.out.println("List after pairwiseSwap call:");
        printList(result);
    }
}
