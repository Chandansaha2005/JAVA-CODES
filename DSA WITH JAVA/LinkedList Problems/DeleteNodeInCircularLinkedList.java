public class DeleteNodeInCircularLinkedList {
    public static Node deleteNode(Node head, int key) {
        Node temp = head;
        if (head.next == head)
            return head;
        for (; temp.next != head; temp = temp.next) {
        }
        Node s = temp, del = head;
        while (del.next != head) {
            if (del.data == key)
                s.next = del.next;
            s = del;
            del = del.next;
        }
        return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr.next != head) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }System.out.print(curr.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;


        System.out.println("Original list:");
        printList(head);

        Node result = deleteNode(head, 3);

        System.out.println("List after deleteNode call:");
        printList(result);
    }
}
