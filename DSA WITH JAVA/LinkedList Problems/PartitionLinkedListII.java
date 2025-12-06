public class PartitionLinkedListII {
    public static Node partition(Node head, int x) {
        Node temp = new Node(0);
        Node temp2 = new Node(0);
        Node temp3 = new Node(0);
        Node i = head, k = temp, j = temp2, m = temp3;
        while (i != null) {
            if (i.data < x) {
                k.next = i;
                i = i.next;
                k = k.next;
            }
            else if(i.data==x){
                m.next=i;
                i=i.next;
                m=m.next;
            } else {
                j.next = i;
                i = i.next;
                j = j.next;
            }
        }
        j.next = null;
        m.next=temp2.next;
        k.next = temp3.next;
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
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        System.out.println("Original list:");
        printList(head);

        Node result = partition(head, 3);

        System.out.println("List after partition call:");
        printList(result);
    }
}
