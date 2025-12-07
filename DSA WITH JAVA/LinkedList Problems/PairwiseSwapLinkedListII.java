public class PairwiseSwapLinkedListII {
    public static Node pairwiseSwap(Node head) {
        if (head == null || head.next == null)
            return head;
        Node i = head;
        while (i != null && i.next != null) {
            int temp = i.data;
            i.data = i.next.data;
            i.next.data = temp;
            i = i.next.next;
        }
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
        head.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        printList(head);

        Node result = pairwiseSwap(head);

        System.out.println("List after pairwiseSwap call:");
        printList(result);
    }
}
