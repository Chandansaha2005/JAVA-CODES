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
    Node top;

    StackList(int data) {
        push(data);
    }

    void push(int data) {
        Node st = new Node(data);
        if (top == null) {
            top = st;
        } else {
            st.next = top;
            top = st;
        }
        size++;
    }

    int pop() throws Exception {
        if (top == null)
            throw new Exception("Stack Underflow Error");
        int p = top.data;
        top = top.next;
        return p;
    }

    int peek() {
        return top.data;
    }

    void display() {
        System.out.println("\nStack :-");
        for (Node temp = top; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) throws Exception {
        StackList st = new StackList(10);
        st.push(20);
        st.display();
        st.push(30);
        st.display();
        st.push(40);
        st.display();

        st.pop();
        st.display();
        st.pop();
        st.display();
        
        st.push(20);
        st.display();
        st.push(30);
        st.display();
        
        System.out.println("\nPeek = " + st.peek());
        
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
    }
}