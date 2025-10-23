// GFG link For the problem https://www.geeksforgeeks.org/problems/special-stack/1

package stacksandqueues;
import java.util.*;
public class SpecialStack {

    private Stack<Integer> minStack = new Stack<>(); 
    public void push(int a, Stack<Integer> s) {
        s.push(a);
        if (minStack.isEmpty() || a <= minStack.peek()) {
            minStack.push(a);
        }
    }
    public int pop(Stack<Integer> s) {
        if (s.isEmpty()) return -1;
        int val = s.pop();
        if (!minStack.isEmpty() && val == minStack.peek()) {
            minStack.pop();
        }
        return val;
    }

    public int min(Stack<Integer> s) {
        if (minStack.isEmpty()) return -1;
        return minStack.peek();
    }
    public boolean isFull(Stack<Integer> s, int n) {
        return s.size() == n;
    }
    public boolean isEmpty(Stack<Integer> s) {
        return s.isEmpty();
    }
}

