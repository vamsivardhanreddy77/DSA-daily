// GFG link for this problem https://www.geeksforgeeks.org/problems/reverse-a-stack/1
package stacksandqueues;

public class ReversingAStack {
    public static void reverseStack(Stack<Integer> st) {
        Stack<Integer> res=new Stack<>();
        while(!st.isEmpty()){
            int top=st.pop();
            res.push(top);
        }
        st.addAll(res);
    }
}
