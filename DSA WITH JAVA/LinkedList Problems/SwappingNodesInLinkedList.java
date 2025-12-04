public class SwappingNodesInLinkedList {
    public static LNode swapNodes(LNode head, int k) {
        LNode start = new LNode(0, head);
        LNode slow = start;
        LNode fast = start;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        LNode a = fast;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        int temp = slow.val;
        slow.val = a.val;
        a.val = temp;
        return head;
    }

    public static void printList(LNode head) {
        LNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LNode head = new LNode(1);
        head.next = new LNode(2);
        head.next.next = new LNode(3);
        head.next.next.next = new LNode(4);
        head.next.next.next.next = new LNode(5);
        System.out.println("Original list:");
        printList(head);
        LNode result = swapNodes(head, 2);
        System.out.println("List after swapNodes call:");
        printList(result);
    }
}

class LNode {
    int val;
    LNode next;

    LNode() {
    }

    LNode(int val) {
        this.val = val;
    }

    LNode(int val, LNode next) {
        this.val = val;
        this.next = next;
    }
}
