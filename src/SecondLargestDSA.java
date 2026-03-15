import java.util.*;

class getSecondLargest{
    public static int findSecondLargest(int[] arr){
        if(arr==null||arr.length<2){
            throw new IllegalArgumentException("There should be atLeast two elements in the array");
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=1;i < arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest= arr[i];
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            throw new IllegalArgumentException("There is no second element in the array");
        }
        return secondLargest;
    }
}
public class SecondLargestDSA {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        int secondHighest = getSecondLargest.findSecondLargest(arr);
        System.out.println("Second highest element is "+secondHighest);
    }
}
