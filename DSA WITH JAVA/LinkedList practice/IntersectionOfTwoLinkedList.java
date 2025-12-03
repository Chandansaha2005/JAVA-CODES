public class IntersectionOfTwoLinkedList {
    public static Node intersectPoint(Node head1, Node head2) {
        
        return null;
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
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(9);
        head2.next = new Node(10);
        head2.next.next = head1.next.next; // creating an intersection at node with value 3

        System.out.println("List 1:");
        printList(head1);

        System.out.println("List 2:");
        printList(head2);

        Node intersection = intersectPoint(head1, head2);
        System.out.println("Intersection point: " + (intersection != null ? intersection.data : "None"));
    }
}
