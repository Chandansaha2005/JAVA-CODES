public class DetectCycleInLinkedListII {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode start = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (fast == null || fast.next == null)
            return null;
        while (start != slow) {
            start = start.next;
            slow = slow.next;
        }
        return start;
    }
    public static void main(String[] args) {
        // Create a linked list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Create a cycle: -4 -> 2
        head.next.next.next.next = head.next;

        ListNode cycleNode = detectCycle(head);

        System.out.println("Cycle starts at node: " + (cycleNode != null ? cycleNode.val : "None"));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
