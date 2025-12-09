public class ReverseBetweenLinkedList {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode r1 = null;
        ListNode r2 = null;
        if (left == 1) {
            l1 = temp;
            for (int i = 1; i <= right; i++) {
                if (i == right) {
                    r1 = temp;
                    r2 = temp.next;
                }
                temp = temp.next;
            }
            r1.next = null;
            head = reverseList(l1);
            l1 = head;
            while (l1.next != null)
                l1 = l1.next;
            l1.next = r2;
        } else {
            for (int i = 1; i <= right; i++) {
                if (i == left - 1) {
                    l1 = temp;
                    l2 = temp.next;
                }
                if (i == right) {
                    r1 = temp;
                    r2 = temp.next;
                }
                temp = temp.next;
            }
            l1.next = null;
            r1.next = null;
            l1.next = reverseList(l2);
            while (l1.next != null)
                l1 = l1.next;
            l1.next = r2;
        }
        return head;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode p = null, c = head, f = head;
        if (head == null || head.next == null)
            return head;
        while (f != null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
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
        // Example list: 1 -> 2 -> 3 -> 4 -> 5
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
