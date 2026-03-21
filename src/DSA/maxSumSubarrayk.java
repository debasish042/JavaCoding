package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class maxSumSubarrayk {
    static long maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        long maxSum=0;
        long sum=0;
        int index =0;
        //Sum of first k elements
        while(index<n&&index<k){
            sum+=arr.get(index);
            index++;
        }
        maxSum=sum;

        for(int i=1;i<n-k+1;i++){
            int prevElement = arr.get(i-1);
            int nextElement = arr.get(i+k-1);

            sum= sum-prevElement+nextElement;
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 5, 1, 8, 2, 9, 1));
        int k = 3;
        int n = arr.size();

        long result = maximumSumSubarray(k, arr, n);

        System.out.println("Maximum sum of subarray of size " + k + " = " + result);
    }



    }

