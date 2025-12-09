class StackClass {
    int MAX = 5;
    int[] stack = new int[MAX];
    int top = -1;

    void push(int data) {
        if (top == MAX - 1)
            System.out.println("Stack Overflow");
        else
            stack[++top] = data;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return stack[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return stack[top];
    }

    void printStack() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        for (int i = 0; i <= top; i++)
            System.out.print(stack[i] + " ");
        System.out.println();
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        StackClass st = new StackClass();
        st.push(10);
        st.printStack();
        System.out.println(st.top);
        st.push(20);
        st.printStack();
        System.out.println(st.top);
        st.push(30);
        st.printStack();
        System.out.println(st.top);
        st.push(40);
        st.printStack();
        System.out.println(st.top);

        st.pop();
        st.printStack();
        System.out.println(st.top);
        st.pop();
        st.printStack();
        System.out.println(st.top);
        st.pop();
        st.printStack();
        System.out.println(st.top);
        st.pop();
        st.printStack();
        System.out.println(st.top);
    }
}
