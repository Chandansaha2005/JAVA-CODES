public class RotateRightList {
    public static int len(ListNode head) {
        int l = 0;
        for (ListNode temp = head; temp != null; temp = temp.next)
            l++;
        return l;
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        int n = len(head);
        k %= n;
        if (k == 0)
            return head;
        for (int i = 0; i <= k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode b = slow.next;
        ListNode a = b;
        slow.next = null;
        while (a.next != null) {
            a = a.next;
        }
        a.next = head;
        head = b;
        return head;
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

        ListNode result = rotateRight(head, 2);

        System.out.println("List after rotateRight call:");
        printList(result);
    }
}
