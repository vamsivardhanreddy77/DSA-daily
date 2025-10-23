package stacksandqueues;

public class ReversingaStringUsingStack {
    public String reverse(String S) {
        Stack <Character> st=new Stack<>();
        for(char ch:S.toCharArray()){
            st.push(ch);
            
        }

        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.toString();
    }
}
