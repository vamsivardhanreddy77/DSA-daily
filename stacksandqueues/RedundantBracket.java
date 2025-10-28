//GFG link for this problem https://www.geeksforgeeks.org/problems/expression-contains-redundant-bracket-or-not/1
package stacksandqueues;
public class RedundantBracket {
    public static boolean checkRedundancy(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!=')'){
                st.push(ch);
            }else{
                boolean opfound=false;
                while(!st.isEmpty()&&st.peek()!='('){
                    char top=st.pop();
                    if(top=='+'||top=='-'||top=='/'||top=='*'){
                        opfound=true;
                    }
                }
                if(!st.isEmpty()) st.pop();
                if(!opfound) return true;
            }
        }
        return false;
    }
}
