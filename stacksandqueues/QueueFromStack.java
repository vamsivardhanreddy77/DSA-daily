//GFG link for this problem https://www.geeksforgeeks.org/problems/queue-using-two-stacks/1
package stacksandqueues;
public class QueueFromStack {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    public void push(int B) {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(B);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }

    public int pop() {
        if(st1.isEmpty()) return -1;
        return st1.pop();
    }
}
    
