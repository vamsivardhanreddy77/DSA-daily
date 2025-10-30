//GFG link for this problem https://www.geeksforgeeks.org/problems/interleave-the-first-half-of-the-queue-with-second-half/1
package stacksandqueues;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveFirstHalfWithSecondHalfinQueue {
    public void rearrangeQueue(Queue<Integer> q) {
        if(q.size()%2!=0) return ;
        Queue<Integer> firsthalf=new LinkedList<>();
        int half=q.size()/2;
        for(int i=0;i<half;i++){
            firsthalf.add(q.remove());
        }
        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }
}
