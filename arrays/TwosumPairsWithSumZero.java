package arrays;

import java.util.ArrayList;
import java.util.Arrays;

class TwosumPairsWithSumZero{
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        while(left<right){
            int sum=arr[left]+arr[right];
            
            if(sum==0){
                ArrayList<Integer> pair=new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                res.add(pair);
                int leftval=arr[left];
                int rightval=arr[right];
                while(left<right&&arr[left]==leftval)left++;
                while(left<right&&arr[right]==rightval)right--;
            }else if(sum<0) left++;
            else right--;
        }
        return res;
    }
}

