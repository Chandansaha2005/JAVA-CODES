public class RemoveDuplicatesFromSortedListII {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(0, head);
        ListNode p = temp, i = head;
        while (i != null) {
            boolean duplicate = false;
            for (; i.next != null && i.val == i.next.val; i = i.next)
                duplicate = true;
            if (duplicate)
                p.next = i.next;
            else
                p = p.next;
            i = i.next;
        }
        return temp.next;
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
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        ListNode result = deleteDuplicates(head);

        System.out.println("List after deleteDuplicates call:");
        printList(result);
    }
}
