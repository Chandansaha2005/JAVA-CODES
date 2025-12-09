public class ReverseBetweenLinkedList {
    public static Node reverseBetween(Node head, int left, int right) {
        Node temp = head;
        Node l1 = null;
        Node l2 = null;
        Node r1 = null;
        Node r2 = null;
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

    public static Node reverseList(Node head) {
        Node p = null, c = head, f = head;
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

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example list: 1 -> 2 -> 3 -> 4 -> 5
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
