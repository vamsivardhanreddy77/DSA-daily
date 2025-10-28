//GFG link for this problem https://www.geeksforgeeks.org/problems/stack-permutations/1
package stacksandqueues;

public class ValidStackOperations {
    public boolean validateOp(int[] a, int[] b) {
        Stack<Integer> st=new Stack<>();
        int v=0;
        for(int j:a){
            st.push(j);
            while(!st.isEmpty()&&st.peek()==b[v]){
                st.pop();
                v++;
            }
        }
        return st.isEmpty();
    }
}

