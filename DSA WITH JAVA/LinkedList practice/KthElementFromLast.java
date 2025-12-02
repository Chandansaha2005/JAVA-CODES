public class KthElementFromLast {
    static int getKthFromLast(Node head, int k) {
        int size = 0;
        for (Node temp = head; temp != null; temp = temp.next)
            size++;
        Node temp = head;
        for (int i = 1; i < size - k + 1; i++)
            temp = temp.next;
        return temp.data;
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
        System.out.println(getKthFromLast(head, 2));
    }
}
