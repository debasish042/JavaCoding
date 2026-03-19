package DSA;

import java.util.*;

class Index{
    public static int[] findTwoSumIndex(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compliment= target-arr[i];

            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
            map.put(arr[i],i);

        }
        return new int[] {-1,-1};

    }
}

public class TwoSumDSA {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(Index.findTwoSumIndex(arr,target)));
    }
}

