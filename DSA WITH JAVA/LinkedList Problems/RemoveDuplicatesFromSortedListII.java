public class RemoveDuplicatesFromSortedListII {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode i = head, j = head, p = temp;
        while (i != null) {
            if (i.next == null || i.val != i.next.val) {
                p.next = i;
                p = i;
                i = i.next;
            } else {
                j = i.next;
                while (j != null && j.val == i.val) {
                    j = j.next;
                }
                i = j;
            }
        }
        p.next = i;
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
