//Link for this problem https://www.naukri.com/code360/problems/rotate-array_1230543?topList=love-babbar-dsa-sheet-problems&leftPanelTabValue=SUBMISSION

package arrays;
import java.util.*;
public class RotateArrLeft {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n=arr.size();
        k=k%n;
        
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    public static void reverse(ArrayList<Integer> arr,int left,int right){
        while(left<right){
            int temp=arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right,temp);
            left++;
            right--;
        }
    }
}

