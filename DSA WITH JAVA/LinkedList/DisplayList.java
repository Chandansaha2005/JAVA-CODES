public class DisplayList {
    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    static void fprint(Node head) {
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " -> ");
        System.out.println("null");
    }

    static void Rprint(Node head) {
        Node temp = head;
        if (temp == null) {
            System.out.print("null");
            return;
        }
        System.out.print(temp.data + " -> ");
        Rprint(temp.next);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        print(a);
    }
}
