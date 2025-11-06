//GFG link for this problem https://www.geeksforgeeks.org/problems/three-sum/1

package arrays;
import java.util.*;
public class ThreeSum {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            if(i>0&&arr[i]==arr[i-1])continue;
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=arr[left]+arr[right]+arr[i];
                if(sum==0){
                    res.add(new ArrayList<>(Arrays.asList(arr[i],arr[left],arr[right])));
                    left++;
                    right--;
                    while(left<right&&arr[left]==arr[left-1])left++;
                    while(left<right&&arr[right]==arr[right+1]) right--;
                }else if(sum>0) right--;
                else left++;
            }
        }
        return res;
    }
}

}
