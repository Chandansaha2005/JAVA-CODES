public class AddTwoNumbersLinkedList {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode sum = head, i = null, j = null;
        while (l1 != null && l1.val == 0) {
            l1 = l1.next;
        }
        while (l2 != null && l2.val == 0) {
            l2 = l2.next;
        }
        if (l1 != null)
            i = reverseList(l1);
        if (l2 != null)
            j = reverseList(l2);
        int carry = 0;
        while (i != null && j != null) {
            int val = i.val + j.val + carry;
            carry = val / 10;
            ListNode s = new ListNode(val % 10);
            sum.next = s;
            sum = sum.next;
            i = i.next;
            j = j.next;
        }
        while (i != null) {
            int val = i.val + carry;
            carry = val / 10;
            ListNode s = new ListNode(val % 10);
            sum.next = s;
            sum = sum.next;
            i = i.next;
        }
        while (j != null) {
            int val = j.val + carry;
            carry = val / 10;
            ListNode s = new ListNode(val % 10);
            sum.next = s;
            sum = sum.next;
            j = j.next;
        }
        if (carry > 0) {
            ListNode s = new ListNode(carry);
            sum.next = s;
            sum = sum.next;
        }
        sum.next = null;
        sum = reverseList(head.next);
        return sum;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = null, c = head, f = head;
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
        // Example: two numbers represented as linked lists
        // Number 342 represented as 2 -> 4 -> 3
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        // Number 465 represented as 5 -> 6 -> 4
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        System.out.println("First number:");
        printList(l1);
        System.out.println("Second number:");
        printList(l2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.println("Sum as linked list:");
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
