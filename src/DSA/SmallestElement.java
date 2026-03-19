package DSA;

import java.util.Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int [] arr = {7,1,2,3,5};

        Arrays.sort(arr);

        int minimum = arr[0];

        System.out.println("Minimum element is "+ minimum);


    }
}
