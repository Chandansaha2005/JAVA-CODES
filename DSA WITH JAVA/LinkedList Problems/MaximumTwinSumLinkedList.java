public class MaximumTwinSumLinkedList {
    public static int pairSum(ListNode head) {
        int max = 0;
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        ListNode curr = s, fwd = s, prev = null;
        while (fwd != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        while (head != null && prev != null) {
            int sum = head.val + prev.val;
            if (sum > max)
                max = sum;
            head = head.next;
            prev = prev.next;
        }
        return max;
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
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println("Original list:");
        printList(head);

        int result = pairSum(head);

        System.out.println("Maximum twin sum: " + result);
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
