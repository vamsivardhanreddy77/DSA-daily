//GFG link for this problem https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

package arrays;

public class CountInversions {

    public static int inversionCount(int arr[]) {
        return mergeSortAndCount(arr,0,arr.length-1);
    }
    public static int mergeSortAndCount(int[]arr,int left,int right){
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid + 1, right);
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }
    public static int mergeAndCount(int[] arr,int left,int mid,int right){
        int[] leftArr=new int[mid-left+1];
        int[] rightArr=new int[right-mid];
        for (int i = 0; i < leftArr.length; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < rightArr.length; j++)
            rightArr[j] = arr[mid + 1 + j];
        int i=0;
        int j=0;
        int k=left,swaps=0;
        while(i<leftArr.length&&j<rightArr.length){
            if(leftArr[i]<=rightArr[j]){
                arr[k++]=leftArr[i++];
            }else{
                arr[k++]=rightArr[j++];
                swaps+=(leftArr.length-i);
            }
        }
        while(i<leftArr.length){
            arr[k++]=leftArr[i++];
            
        }
        while(j<rightArr.length){
            arr[k++]=rightArr[j++];
        }
        return swaps;
    }
}

