//GFG link for this Problem https://www.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1
package stacksandqueues;
import java.util.*;
public class InsertingElementAtBottom {
    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        if(st.isEmpty()) {
            st.push(x);
            return st;
        }
        int top=st.pop();
        insertAtBottom(st,x);
        st.push(top);
        return st;
    }
}