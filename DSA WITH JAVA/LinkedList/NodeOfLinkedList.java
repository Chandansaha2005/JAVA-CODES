public class NodeOfLinkedList {
    public static void main(String[] args) {
        // Creating Some Node
        // Giving the "data" In Each Node
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // Linking The Nodes (a->b->c->d->e->)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a);// Node@7344699f
        System.out.println(b);// Node@6b95977
        System.out.println(c);// Node@7e9e5f8a

        System.out.println(a.data);// 10
        System.out.println(b.data);// 20
        System.out.println(c.data);// 30

        System.out.println(a.next);// Node@6b95977 (Address of b)
        System.out.println(b.next);// Node@7e9e5f8a (Address of c)

        System.out.println(a.next.data);// 20 (data of b)
        System.out.println(b.next.data);// 30 (data of c)

        System.out.println(a.next.next);// Node@7e9e5f8a (Address of c)
        System.out.println(a.next.next.data);// 30 (data of c)

        System.out.println(a.next.next.next.next.data);// 50 (data of e)

        System.out.println(e.next);// null (as no node present or linked)
    }
}