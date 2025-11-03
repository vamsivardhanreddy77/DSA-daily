//GFG link for this problem https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1

package arrays;

public class MovingNegToEnd {
    public void segregateElements(int[] arr) {
        int n=arr.length;
        int[] arr1=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                arr1[temp++]=arr[i];
                
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                arr1[temp++]=arr[i];
                
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=arr1[i];
        }
        
    }
}

