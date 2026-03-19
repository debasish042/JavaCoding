package DSA;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int [] arr = {3,4,5,2,1};

        Arrays.sort(arr);

        System.out.println("Sorted array is "+ Arrays.toString(arr));

        int secondLargest = arr[arr.length-2];

        System.out.println("Second largest element is: " + secondLargest);
    }

}
