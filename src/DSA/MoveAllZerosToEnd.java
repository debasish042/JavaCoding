package DSA;

import java.util.*;
class MoveAllZeros{
    public static void moveAllZerosToEnd(int[] arr){
        int index = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
            }
        }
    }

}
public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int [] arr = {1,2,0,0,5,0,6};

        MoveAllZeros.moveAllZerosToEnd(arr);
        System.out.println("After removing all zeros to end "+Arrays.toString(arr));
    }
}
