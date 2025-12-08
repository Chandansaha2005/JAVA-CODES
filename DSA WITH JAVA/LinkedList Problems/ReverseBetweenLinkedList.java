public class ReverseBetweenLinkedList {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        
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
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
