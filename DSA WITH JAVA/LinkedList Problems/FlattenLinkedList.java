public class FlattenLinkedList {
    public static Bode flatten(Bode head) {
        if (head == null)
            return head;
        

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
