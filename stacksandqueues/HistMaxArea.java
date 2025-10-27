//GFG link for this problem https://www.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1

package stacksandqueues;

public class HistMaxArea {
    public static int getMaxArea(int arr[]) {
        // code here
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int left[]=new int[n];
        int right[]=new int[n];
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }
            left[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }
            right[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        int maxarea=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int area=arr[i]*width;
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
}

