//GFG link for the problem https://www.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1
package stacksandqueues;
import java.util.*;
public class DeletingMiddleElementInAStack {
    public void deleteMid(Stack<Integer> s) {
        int middle=s.size()/2;
        delete(s,middle);
    }
    public void delete(Stack<Integer> s,int middle){
        if(middle==0) {
            s.pop();
            return;
        }
        int top=s.pop();
        delete(s,middle-1);
        s.push(top);
    }
}

