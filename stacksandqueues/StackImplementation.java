package stacksandqueues;

class Stack {
    private int[] arr;
    private int top;
    private int capacity;
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }


    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = x;
        System.out.println(x + " pushed into stack.");
    }  
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        System.out.println(arr[top] + " popped from stack.");
        return arr[top--];
    }
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
    public int size() {
        return top + 1;
    }
}
public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        stack.pop();
        stack.pop();

        System.out.println("Stack size: " + stack.size());

        stack.pop();
        stack.pop(); 
    }
}