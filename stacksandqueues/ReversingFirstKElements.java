//GFG link for this problem https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
package stacksandqueues;
public class ReversingFirstKElements {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (q == null || k <= 0 || k > q.size()) return q;
        Stack<Integer> st=new Stack<>();
        int n=q.size();
        for(int i=0;i<k;i++){
            st.add(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        int rem=q.size()-k;
        for(int i=0;i<rem;i++){
            q.add(q.remove());
        }
        return q;
    }
}

