//GFG link for this problem https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
package arrays;

public class Sort012 {
    public void sort012(int[] arr) {
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==1) mid++;
            else if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else{
                swap(arr,mid,high);
                
                high--;
                
            }
        }
        
    }
    public void swap(int[] arr,int left,int right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
    }
}
