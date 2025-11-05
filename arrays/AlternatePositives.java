//GFG link for this problem https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1

package arrays;
import java.util.*;
public class AlternatePositives {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int num:arr){
            if(num<0) neg.add(num);
            else pos.add(num);
        }
        int i=0,p=0,n=0;
        boolean ref=true;
        while(p<pos.size()&&n<neg.size()){
            if(ref) {
                arr.set(i++,pos.get(p++));
            }else arr.set(i++,neg.get(n++));
            ref=!ref;
        }
        while(p<pos.size())arr.set(i++,pos.get(p++));
        while(n<neg.size()) arr.set(i++,neg.get(n++));
    }
}

