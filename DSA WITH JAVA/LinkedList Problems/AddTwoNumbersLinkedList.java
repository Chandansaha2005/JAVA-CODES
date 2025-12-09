public class AddTwoNumbersLinkedList {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        return null;
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
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
