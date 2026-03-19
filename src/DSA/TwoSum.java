package DSA;

import java.util.Arrays;

class Two{
    public static int[] findTwoSum(int[] arr,int target){

        for (int i = 0; i <arr.length ; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j]==target){
                    return new int[]{i,j};
                }
            }


        }
        return new int[]{-1,-1};
    }
}

public class TwoSum {

    public static void main(String[] args) {
        int [] arr= {2,5,7,6,4};

        int target = 9;

        int[] result = Two.findTwoSum(arr, target);
        System.out.println("Result is "+ Arrays.toString(result));
    }
}
