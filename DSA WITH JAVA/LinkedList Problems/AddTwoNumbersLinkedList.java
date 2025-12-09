public class AddTwoNumbersLinkedList {
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node head = new Node(-1);
        Node sum = head, i = null, j = null;
        while (l1 != null && l1.data == 0) {
            l1 = l1.next;
        }
        while (l2 != null && l2.data == 0) {
            l2 = l2.next;
        }
        if (l1 != null)
            i = reverseList(l1);
        if (l2 != null)
            j = reverseList(l2);
        int carry = 0;
        while (i != null && j != null) {
            int data = i.data + j.data + carry;
            carry = data / 10;
            Node s = new Node(data % 10);
            sum.next = s;
            sum = sum.next;
            i = i.next;
            j = j.next;
        }
        while (i != null) {
            int data = i.data + carry;
            carry = data / 10;
            Node s = new Node(data % 10);
            sum.next = s;
            sum = sum.next;
            i = i.next;
        }
        while (j != null) {
            int data = j.data + carry;
            carry = data / 10;
            Node s = new Node(data % 10);
            sum.next = s;
            sum = sum.next;
            j = j.next;
        }
        if (carry > 0) {
            Node s = new Node(carry);
            sum.next = s;
            sum = sum.next;
        }
        sum.next = null;
        sum = reverseList(head.next);
        return sum;
    }

    public static Node reverseList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node p = null, c = head, f = head;
        while (f != null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
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
        // Example: two numbers represented as linked lists
        // Number 342 represented as 2 -> 4 -> 3
        Node l1 = new Node(2, new Node(4, new Node(3)));
        // Number 465 represented as 5 -> 6 -> 4
        Node l2 = new Node(5, new Node(6, new Node(4)));

        System.out.println("First number:");
        printList(l1);
        System.out.println("Second number:");
        printList(l2);

        Node result = addTwoNumbers(l1, l2);

        System.out.println("Sum as linked list:");
        printList(result);
    }
}

class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
