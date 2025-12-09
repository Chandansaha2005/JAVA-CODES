public class ReverseBetweenLinkedList_Optimized {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null)
            return null;
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode prev = temp;
        for (int i = 1; i < left; i++)
            prev = prev.next;
        ListNode c = prev.next;
        ListNode f = null, p = null;
        for (int i = left; i <= right; i++) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        prev.next.next = c;
        prev.next = p;
        return temp.next;
    }

    public static void printList(ListNode head) {
        ListNode c = head;
        while (c != null) {
            System.out.print(c.val + " ");
            c = c.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        System.out.println("Original list:");
        printList(head);
        ListNode result = reverseBetween(head, 2, 4);
        System.out.println("List after reverseBetween call:");
        printList(result);
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
