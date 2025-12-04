public class KthElementFromLastOptimized {
    static int getKthFromLast(Node head, int k) {
        Node slow = head, fast = head;
        for (int i = 0; i < k; i++) {
            if (fast == null)
                return -1;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printList(head);
        System.out.println(getKthFromLast(head, 5));
    }
}
