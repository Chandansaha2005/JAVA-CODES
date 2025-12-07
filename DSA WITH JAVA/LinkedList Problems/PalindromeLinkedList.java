public class PalindromeLinkedList {
    public static boolean isPalindrome(Node head) {
        boolean flag = false;
        Node rev = new Node(0);
        Node p = null, c = head, f = head;
        while (f != null) {
            f = c.next;
            Node n = new Node(c.data);
            n.next = rev;
            rev = n;
            c = f;
        }
        Node i = rev, j = head;
        while (i.next != null && j != null) {
            if (i.data == j.data)
                flag = true;
            else
                flag = false;
            i = i.next;
            j = j.next;
        }
        return flag;
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
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Original list:");
        printList(head);

        boolean result = isPalindrome(head);

        System.out.println("Is palindrome? " + result);
    }
}
