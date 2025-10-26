//GFG link for this problem https://www.geeksforgeeks.org/problems/sort-a-stack/1

package stacksandqueues;

public class SortingAStack {
    public void sortStack(Stack<Integer> st) {
        if(st.isEmpty()) return;
        int top=st.pop();
        sortStack(st);
        insert(st,top);
    }
    public void insert(Stack<Integer> st,int x){
        if(st.isEmpty()||st.peek()<=x){
            st.push(x);
            return;
        }
        int top=st.pop();
        insert(st,x);
        st.push(top);
        
    }
}

