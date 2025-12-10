class Pair<A, B> {
    public A first;
    public B second;

    Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }
}

public class SplitCircularList {
    public Pair<Node, Node> splitList(Node head) {
        if (head.next == head) 
            return new Pair<>(head, head);

        if (head.next.next == head) {
            Node h1 = head;
            Node h2 = head.next;
            h1.next = h1;
            h2.next = h2;
            return new Pair<>(h1, h2);
        }

        Node slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head1 = head, head2 = slow.next;
        slow.next = head1;
        if (fast.next.next == head) fast = fast.next;
        fast.next = head2;

        return new Pair<>(head1, head2);
    }

    public static void printCircularList(Node head) {
        if (head == null) return;
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head; // make it circular

        System.out.println("Original circular list:");
        printCircularList(head);

        SplitCircularList scl = new SplitCircularList();
        Pair<Node, Node> result = scl.splitList(head);

        System.out.println("First half:");
        printCircularList(result.first);

        System.out.println("Second half:");
        printCircularList(result.second);
    }
}
