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

    }
}

public class StackUsingArray {

}
