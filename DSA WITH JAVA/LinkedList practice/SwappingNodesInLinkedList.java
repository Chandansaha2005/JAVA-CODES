public class SwappingNodesInLinkedList {
    public static ListNode swapNodes(ListNode head, int k) {
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
