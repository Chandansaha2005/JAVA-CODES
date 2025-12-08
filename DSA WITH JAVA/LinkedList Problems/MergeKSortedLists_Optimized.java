public class MergeKSortedLists_Optimized {

    public static Node mergeKLists(Node[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        Node head = null;
        for (int i = 0; i < lists.length; i++)
            head = mergeTwoLists(head, lists[i]);
        return head;
    }

    public static Node mergeTwoLists(Node head1, Node head2) {
        Node temp = new Node(-1);
        Node tail = temp;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        tail.next = (head1 != null) ? head1 : head2;
        return temp.next;
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
        // Example: three sorted linked lists
        Node head1 = new Node(1, new Node(4, new Node(5)));
        Node head2 = new Node(1, new Node(3, new Node(4)));
        Node l3 = new Node(2, new Node(6));

        Node[] lists = { head1, head2, l3 };

        System.out.println("Original lists:");
        printList(head1);
        printList(head2);
        printList(l3);

        Node head = mergeKLists(lists);

        System.out.println("Merged list:");
        printList(head);
    }
}
