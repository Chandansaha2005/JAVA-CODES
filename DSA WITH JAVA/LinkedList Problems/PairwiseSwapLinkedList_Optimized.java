public class PairwiseSwapLinkedList_Optimized {
    public static ListNode pairwiseSwap(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode oddList = new ListNode(0), evenList = new ListNode(0);
        ListNode odd = oddList, even = evenList;
        ListNode curr = head;
        int idx = 1;
        while (curr != null) {
            if (idx % 2 != 0) {
                odd.next = curr;
                odd = odd.next;
            } else {
                even.next = curr;
                even = even.next;
            }
            curr = curr.next;
            idx++;
        }
        odd.next = null;
        even.next = null;
        ListNode res = new ListNode(0);
        ListNode tail = res;
        ListNode o = oddList.next, e = evenList.next;
        while (o != null || e != null) {
            if (e != null) {
                tail.next = e;
                tail = tail.next;
                e = e.next;
            }
            if (o != null) {
                tail.next = o;
                tail = tail.next;
                o = o.next;
            }
        }
        tail.next = null;
        return res.next;
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

        ListNode result = pairwiseSwap(head);

        System.out.println("List after pairwiseSwap call:");
        printList(result);
    }
}
