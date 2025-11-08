//GFG link for this problem https://www.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1

package arrays;
import java.util.*;
public class FourSum {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> res=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++){
            if(i>0&&arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1&&arr[j]==arr[j-1]) continue;
                int left=j+1,right=n-1;
                while(left<right){
                    int sum=arr[left]+arr[right]+arr[i]+arr[j];
                    if(sum==target){
                        
                     res.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                     while(left<right&&arr[left]==arr[left+1]) left++;
                     while(left<right&&arr[right]==arr[right-1]) right--;
                     left++;
                     right--;
                    
                }else if(sum<target) left++;
                else right--;
                    
                }
            }
        }return res;
    }
    
}
