public class SortLinkedList {
    public static Node temp = new Node(0);

    public static Node merge(Node head1, Node head2) {
        Node k = temp, i = head1, j = head2;
        while (i != null && j != null) {
            if (i.data <= j.data) {
                k.next = i;
                i = i.next;
                k = k.next;
            } else {
                k.next = j;
                j = j.next;
                k = k.next;
            }
        }
        while (i != null) {
            k.next = i;
            i = i.next;
            k = k.next;
        }
        while (j != null) {
            k.next = j;
            j = j.next;
            k = k.next;
        }
        return temp.next;
    }

    public static Node mergeSort(Node head) {
        if (head.next == null)
            return head;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        head = mergeSort(head);
        head2 = mergeSort(head2);
        return merge(head, head2);
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
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.println("Original list:");
        printList(head);
        Node result = mergeSort(head);

        System.out.println("List after mergeSort call:");
        printList(result);
    }
}
