import java.util.*;
public class LargestElementOfArray {

    public static void main(String[] args) {

        int [] arr= {4,23,45,2,1};

        Arrays.sort(arr);

        int largest= arr[arr.length-1];

        System.out.println("The largest element is "+largest);
    }
}
