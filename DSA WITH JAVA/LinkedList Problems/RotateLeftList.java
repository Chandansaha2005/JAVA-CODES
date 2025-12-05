public class RotateLeftList {
    public static int len(Node head) {
        int l = 0;
        for (Node temp = head; temp != null; temp = temp.next)
            l++;
        return l;
    }

    public static Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int n = len(head);
        k %= n;
        if (k == 0)return head;
        Node fast = head;
        for (int i = 1; i < k; i++) fast = fast.next;
        Node newHead = fast.next;
        fast.next = null;
        Node tail = newHead;
        while (tail.next != null) tail = tail.next;
        tail.next = head;
        return newHead;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        printList(head);

        Node result = rotate(head, 6);

        System.out.println("List after rotateRight call:");
        printList(result);
    }
}
