public class DeleteMiddleNode {
    public static Node deleteMid(Node head) {
        Node s = head;
        Node f = head;
        Node p = null;
        if (s == null || s.next == null)
            return null;
        while (f != null && f.next != null) {
            f = f.next.next;
            p = s;
            s = s.next;
        }
        p.next = s.next;
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
        head.next.next.next.next = new Node(5);

        printList(head);
        head = deleteMid(head);
        printList(head);
    }
}
