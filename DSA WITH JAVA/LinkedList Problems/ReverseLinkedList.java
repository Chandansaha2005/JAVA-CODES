import java.util.ArrayList;

public class ReverseLinkedList {
    public static Node reverseList(Node head) {
        ArrayList<Node> rev = new ArrayList<>();
        for (Node temp = head; temp != null; temp = temp.next)rev.add(temp);
        for (int i = rev.size() - 1; i > 0; i--)rev.get(i).next = rev.get(i - 1);
        rev.get(0).next = null;
        return rev.get((rev.size()-1));
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

        Node result = reverseList(head);

        System.out.println("List after reverseList call:");
        printList(result);
    }
}
