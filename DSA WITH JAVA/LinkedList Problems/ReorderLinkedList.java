public class ReorderLinkedList {
    public static void reorderlist(ListNode head) {
        // Partition
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        // Reverse 2nd Half
        ListNode a = s.next, b = s.next, c = null;
        s.next = null;
        while (b != null) {
            b = a.next;
            a.next = c;
            c = a;
            a = b;
        }
        // Merge With Head
        ListNode i = head, j = i.next, k = c;
        while (i != null && k != null) {
            i.next = k;
            k = k.next;
            i.next.next = j;
            i = j;
            j = j.next;
        }
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
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        System.out.println("Original list:");
        printList(head);

        reorderlist(head);

        System.out.println("List after reorderlist call:");
        printList(head);
    }
}
