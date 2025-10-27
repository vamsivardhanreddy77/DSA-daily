//GFG link for this problem https://www.geeksforgeeks.org/problems/valid-substring0624/1

package stacksandqueues;
public class MaxSubStringLength {
    public int maxLength(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int maxLen=0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(i);
            } else {
                st.pop();

                if (st.isEmpty()) {
                    st.push(i); 
                } else {
                    int len = i - st.peek();
                    maxLen = Math.max(maxLen, len);
                }
            }
        }
        return maxLen;
    }
}
    

