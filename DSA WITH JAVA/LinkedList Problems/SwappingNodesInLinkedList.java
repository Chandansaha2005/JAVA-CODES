public class SwappingNodesInLinkedList {
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode start = new ListNode(0, head);
        ListNode slow = start;
        ListNode fast = start;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        ListNode a = fast;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        int temp = slow.val;
        slow.val = a.val;
        a.val = temp;
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
        ListNode result = swapNodes(head, 2);
        System.out.println("List after swapNodes call:");
        printList(result);
    }
}
