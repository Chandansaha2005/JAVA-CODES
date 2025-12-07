public class ReverseLinkedList_Recursive {

    public static Node reverseList(Node head) {
        if(head.next==null)return head;
        Node a = head.next;
        head.next = null;
        Node b = reverseList(a);
        a.next = head;
        return b;

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

        Node result = reverseList(head);

        System.out.println("List after reverseList call:");
        printList(result);
    }

}
