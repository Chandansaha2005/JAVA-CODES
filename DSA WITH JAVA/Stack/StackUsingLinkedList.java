class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackList {
    int size = 0;
    Node top = null;
    Node head;

    StackList(int data) {
        push(data);
    }

    void push(int data) {
        Node st = new Node(data);
        if (top == null) {
            top = st;
            head = top;
        } else {
            top.next = st;
            top = st;
        }
        size++;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        if (top.next == null) {
            int p = top.data;
            top = head = null;
            return p;
        }
        Node temp = head;
        for (; temp.next != top; temp = temp.next) {}
        top = temp;
        int p = top.data;
        temp.next = null;
        return p;
    }

    void display() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Stack :-");
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        StackList st = new StackList(10);
        st.push(20);
        st.display();
    }

}