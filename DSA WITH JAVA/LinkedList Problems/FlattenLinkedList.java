public class FlattenLinkedList {
    public static Node flatten(Node root) {
        if (root == null || root.next == null) return root;
        root.next = flatten(root.next);
        return merge(root, root.next);
    }

    private static Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;
        Node result;
        if (a.data < b.data) {
            result = a;
            result.bottom = merge(a.bottom, b);
        } else {
            result = b;
            result.bottom = merge(a, b.bottom);
        }
        result.next = null;
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.bottom = new Node(7);
        root.bottom.bottom = new Node(8);

        root.next = new Node(10);
        root.next.bottom = new Node(20);

        root.next.next = new Node(19);
        root.next.next.bottom = new Node(22);
        root.next.next.bottom.bottom = new Node(50);

        Node ans = flatten(root);

        Node temp = ans;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.bottom;
        }
    }
}

class Node {
    int data;
    Node next;
    Node bottom;
    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
