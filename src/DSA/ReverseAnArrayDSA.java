package DSA;

import java.util.*;

class ReverseArray{
    public static void findReverse(int[] arr){
        int left = 0;
        int right= arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }
}
public class ReverseAnArrayDSA {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        ReverseArray.findReverse(arr);

        System.out.println("Reversed array is "+Arrays.toString(arr));
    }


}
