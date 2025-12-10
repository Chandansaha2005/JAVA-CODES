class Dnode {
    int data;
    Dnode next;
    Dnode prev;

    Dnode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseDoublyLinkedList {
    public static Dnode reverse(Dnode head) {
        Node tail = head;
        while(tail.next!=null)tail=tail.next;
        while(tail.prev!=null){
            tail.next=tail.prev;
            tail=tail.prev;
        }head=tail;
        return head;
        return head;
    }

    public static void printList(Dnode head) {
        Dnode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Dnode head = new Dnode(1);
        Dnode second = new Dnode(2);
        Dnode third = new Dnode(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println("Original list:");
        printList(head);

        Dnode result = reverse(head);

        System.out.println("Reversed list:");
        printList(result);
    }
}
