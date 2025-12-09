public class ReverseBetweenLinkedList_Optimized {
    public static Node reverseBetween(Node head, int left, int right) {
        if (head == null)
            return null;
        Node temp = new Node(-1);
        temp.next = head;
        Node prev = temp;
        for (int i = 1; i < left; i++)
            prev = prev.next;
        Node c = prev.next;
        Node f = null, p = null;
        for (int i = left; i <= right; i++) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        prev.next.next = c;
        prev.next = p;
        return temp.next;
    }

    public static void printList(Node head) {
        Node c = head;
        while (c != null) {
            System.out.print(c.data + " ");
            c = c.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1,
                new Node(2,
                        new Node(3,
                                new Node(4,
                                        new Node(5)))));
        System.out.println("Original list:");
        printList(head);
        Node result = reverseBetween(head, 2, 4);
        System.out.println("List after reverseBetween call:");
        printList(result);
    }
}

class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
