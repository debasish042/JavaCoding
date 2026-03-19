package DSA;

import java.util.*;
class main{
    public static int[] reverseArray (int[] arr){
        int n = arr.length;
        int[] reversed= new int[n];

        for(int i=0;i<n;i++){
            reversed[i]= arr[n-1-i];
        }
        return reversed;
    }
}

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result= main.reverseArray(arr);
        System.out.println("Reversed array is :" +Arrays.toString(result));
    }
}
