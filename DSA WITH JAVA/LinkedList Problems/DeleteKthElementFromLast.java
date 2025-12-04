public class DeleteKthElementFromLast {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        for (int i = 0; i < n; i++)
            fast = fast.next;
        if (fast == null)
            return head.next;
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = slow.next;
        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(head);
        printList(removeNthFromEnd(head, 1));
    }
}