// GFG link for this problem https://www.geeksforgeeks.org/problems/the-celebrity-problem/1
package stacksandqueues ;
public class CelebrityProblem {
    public int celebrity(int mat[][]) {
        Stack<Integer> st=new Stack<>();
        int n=mat.length;
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(mat[a][b]==1) st.push(b);
            else st.push(a);
            
            
        }
        int cand=st.pop();
        for(int i=0;i<n;i++){
            if(i==cand)continue;
            if(mat[cand][i]==1||mat[i][cand]==0) return -1;
        }
        return cand;
    }
}
    
