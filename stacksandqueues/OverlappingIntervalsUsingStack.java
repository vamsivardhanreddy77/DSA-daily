//GFG link for this problem https://www.geeksforgeeks.org/problems/overlapping-intervals--170633/1

package stacksandqueues;

import java.util.ArrayList;
import java.util.Arrays;

public class OverlappingIntervalsUsingStack {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        Stack<int[]> st=new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            int[] top=st.peek();
            int[] current=arr[i];
            if(current[0]<=top[1]){
                top[1]=Math.max(current[1],top[1]);
            }else st.push(current);
            
        }
        ArrayList<int[]> result=new ArrayList<int[]>();
        while (!st.isEmpty()) {
            result.add(0, st.pop());
        }

        return result;
    }
}
