//GFG link for this problem https://www.geeksforgeeks.org/dsa/next-smaller-element/

package stacksandqueues;
import java.util.*;
public class NextSmallerElement {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, -1));
        

        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
           while(!st.isEmpty()&&st.peek()>=arr[i]){
            st.pop();
           }if(!st.isEmpty()){
            result.set(i,st.peek());
           }
           st.push(arr[i]);
        }

        return result;
    }
}

