//GFG link for this problem https://www.geeksforgeeks.org/problems/queue-reversal/1

package stacksandqueues;

import java.util.Queue;

public class QueueReversal {
    public void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty()){
            st.add(q.remove());
        }
        while(!st.isEmpty()) q.add(st.pop());
    }
}