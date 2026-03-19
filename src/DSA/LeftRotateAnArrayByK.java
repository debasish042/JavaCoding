package DSA;

import java.util.*;

class Reverse {
    public static void getReversed(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        Reverse.getReversed(arr, 0, k - 1);
        Reverse.getReversed(arr, k, n - 1);
        Reverse.getReversed(arr, 0, n - 1);
    }
}

public class LeftRotateAnArrayByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        Reverse.leftRotate(arr, k);

        System.out.println(Arrays.toString(arr));
    }
}