package DSA;

import java.util.*;
public class LargestElementOfArray {

    public static void main(String[] args) {
        int [] arr ={23,12,34,45,6};

        Arrays.sort(arr);
        System.out.println("Sorted array is" + Arrays.toString(arr));
        System.out.println("Length of the array is "+arr.length);
        System.out.println("Largest element is "+ arr[arr.length-1]);
    }
}
