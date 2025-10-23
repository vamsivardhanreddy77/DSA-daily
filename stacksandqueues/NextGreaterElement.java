//GFG link for the problem https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

package stacksandqueues;

import java.util.ArrayList;
import java.util.Collections;

public class NextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, -1)); 
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                res.set(i, st.peek());
            }

            st.push(arr[i]);
        }

        return res;
    }
}

