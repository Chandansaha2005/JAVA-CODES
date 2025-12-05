public class RemoveDuplicatesFromSortedList {

    public static Node removeDuplicates(Node head) {
        Node i = head;
        Node j = head;
        while (i != null && i.next != null) {
            j = j.next;
            if (j.data == i.data)
                i.next = j.next;
            else
                i = j;
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
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Original list:");
        printList(head);

        Node result = removeDuplicates(head);

        System.out.println("List after removeDuplicates call:");
        printList(result);
    }
}
