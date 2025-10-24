//GFG link for this problem https://www.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1
package stacksandqueues;

public class PostFixEvaluation {
    public int evaluatePostfix(String[] arr) {
        Stack<Integer> st=new Stack<>();
        for(String token:arr){
            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/") || token.equals("^")) {
                
                int b = st.pop(); 
                int a = st.pop(); 
                int res = 0;

                switch (token) {
                    case "+": res = a + b; break;
                    case "-": res = a - b; break;
                    case "*": res = a * b; break;
                    case "/": 
                        if (a * b < 0 && a % b != 0)
                            res = (a / b) - 1;
                        else
                            res = a / b;
                        break;
                         
                    case "^": res = (int) Math.pow(a, b); break;
                }

                st.push(res);
            } 
            else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}
