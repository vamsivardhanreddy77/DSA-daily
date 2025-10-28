//GFG link for this problem https://www.geeksforgeeks.org/problems/stack-using-two-queues/1
package stacksandqueues;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementingStackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        q.add(x);
        int size=q.size();
        for(int i=0;i<size-1;i++){
            q.add(q.remove());
        }
    }

    void pop() {
        if(!q.isEmpty()) q.remove();
    }

    int top() {
        if(q.isEmpty()) return -1;
        else return q.peek();
    }

    int size() {
        return q.size();
    }
}

