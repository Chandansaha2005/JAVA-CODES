public class MergeKSortedLists {

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        ListNode head = null;
        for (int i = 0; i < lists.length; i++)
            head = mergeTwoLists(head, lists[i]);
        return head;
    }

    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode temp = new ListNode(-1);
        ListNode tail = temp;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        tail.next = (head1 != null) ? head1 : head2;
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
        // Example: three sorted linked lists
        ListNode head1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode head2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = { head1, head2, l3 };

        System.out.println("Original lists:");
        printList(head1);
        printList(head2);
        printList(l3);

        ListNode head = mergeKLists(lists);

        System.out.println("Merged list:");
        printList(head);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
