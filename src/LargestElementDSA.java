import java.util.*;
class largestElementFinder{
    public static  int findLargestElement(int []arr){
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Arrays can't be null or empty");
        }
        int largest = arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
public class LargestElementDSA {
    public static void main(String[] args) {
        int[] arr= {23,45,3,22,4};
        int largest = largestElementFinder.findLargestElement(arr);
        System.out.println(largest);
    }

}
