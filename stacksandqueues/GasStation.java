//GFG link for this problem https://www.geeksforgeeks.org/problems/circular-tour-1587115620/1
package stacksandqueues;

public class GasStation {
    public int startStation(int[] gas, int[] cost) {
        int totalgas=0;
        int currgas=0;
        int start=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            currgas+=gas[i]-cost[i];
            totalgas+=gas[i]-cost[i];
            if(currgas<0){
                start=i+1;
                currgas=0;
            }
        }
        return totalgas>=0?start:-1;
    }
}

