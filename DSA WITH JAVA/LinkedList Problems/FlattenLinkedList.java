public class FlattenLinkedList {
    public static Bode flatten(Bode head) {
        if (head == null || head.next == null)
            return head;
        Bode merged = flatten(head.next);
        return mergeTwoLists(merged, head);
    }

    public static Bode mergeTwoLists(Bode head1, Bode head2) {
        Bode temp = new Bode(-1);
        Bode tail = temp;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.bottom = head1;
                head1 = head1.bottom;
            } else {
                tail.bottom = head2;
                head2 = head2.bottom;
            }
            tail = tail.bottom;
        }
        tail.bottom = (head1 != null) ? head1 : head2;
        return temp.bottom;
    }

    public static void main(String[] args) {
        Bode root = new Bode(5);
        root.next = new Bode(10);
        root.next.next = new Bode(19);

        root.bottom = new Bode(7);
        root.bottom.bottom = new Bode(8);

        root.next.bottom = new Bode(20);

        root.next.next.bottom = new Bode(22);
        root.next.next.bottom.bottom = new Bode(50);

        Bode res = flatten(root);
        Bode p = res;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.bottom;
        }
    }
}

class Bode {
    int data;
    Bode next;
    Bode bottom;

    Bode(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
