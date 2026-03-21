package DSA;
import java.util.*;

class GetMin{
    public static long getMinimumSubArray(int k, int[] arr,int n){
        int sum=0;
        int minSum=0;
        int index=0;

        while(index < k&& index<n){
            sum=sum+ arr[index];
            index++;
        }
        minSum=sum;

        for(int i=1;i<n-k+1;i++){
            int prevElement = arr[i-1];
            int nextElement= arr[i+k-1];

            sum=sum-prevElement+nextElement;
            minSum = Math.min(minSum,sum);
        }
        return minSum;
    }
}

public class MinimumSumSubArrayK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=3;

        long result = GetMin.getMinimumSubArray(k,arr,arr.length);
        System.out.println("Sum of all the elements of size "+k +" is:"+result);
    }
}
