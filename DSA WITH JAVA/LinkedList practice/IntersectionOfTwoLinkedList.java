public class IntersectionOfTwoLinkedList {
    public static Node intersectPoint(Node head1, Node head2) {
        int h1 = 0, h2 = 0;
        for (Node temp = head1; temp != null; temp = temp.next)
            h1++;
        for (Node temp = head2; temp != null; temp = temp.next)
            h2++;
        Node start1 = head1;
        Node start2 = head2;
        if (h1 > h2) {
            for (int i = 0; i < h1 - h2; i++)
                start1 = start1.next;
        } else if (h1 < h2) {
            for (int i = 0; i < h2 - h1; i++)
                start2 = start2.next;
        }
        for (; start1 != null; start1 = start1.next, start2 = start2.next) {

        }
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
        Node common = new Node(15);
        common.next = new Node(30);

        // First list: 10 -> 15 -> 30
        Node head1 = new Node(10);
        head1.next = common;

        // Second list: 3 -> 6 -> 9 -> 15 -> 30
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);
        head2.next.next.next = common; // creating an intersection at node with value 3

        System.out.println("List 1:");
        printList(head1);

        System.out.println("List 2:");
        printList(head2);

        Node intersection = intersectPoint(head1, head2);
        System.out.println("Intersection point: " + (intersection != null ? intersection.data : "None"));
    }
}
