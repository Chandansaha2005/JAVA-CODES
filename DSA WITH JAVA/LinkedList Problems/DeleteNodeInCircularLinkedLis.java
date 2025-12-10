public class DeleteNodeInCircularLinkedLis {
    public static Node deleteNode(Node head, int key) {
        // placeholder
        return head;
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

        System.out.println("Original list:");
        printList(head);

        Node result = deleteNode(head, 3);

        System.out.println("List after deleteNode call:");
        printList(result);
    }
}
