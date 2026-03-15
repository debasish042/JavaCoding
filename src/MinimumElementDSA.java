import java.util.*;

class smallestElementFinder{
    public static int getSmallestElement(int [] arr){
        // check for null and empty
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Arrays can't be null or empty");
        }
        int min =arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }
}
public class MinimumElementDSA {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,1};

        int smallest = smallestElementFinder.getSmallestElement(arr);
        System.out.println(smallest);
    }
}
