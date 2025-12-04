class Node {
    int data;
    Node next;
    Node(int d) { this.data = d; }
}

public class DeleteNodeGFG {
    public static Node deleteNode(Node head, int x) {
        if (x == 1) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 1; i < x - 1; i++) {
                temp = temp.next;
            }
            Node toDelete = temp.next;
            temp.next = toDelete.next;
        }
        return head;
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

        printList(head);
        head = deleteNode(head, 3);
        printList(head);
        head = deleteNode(head, 1);
        printList(head);
    }
}
