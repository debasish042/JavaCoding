package DSA;

import java.util.Arrays;

class MoveNegative{
    public static void moveNegative(int[] arr){

        int left =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i]= arr[left];
                arr[left]=temp;
                left++;
            }
        }

    }
}
public class MoveNegativesToLeft {

    public static void main(String[] args) {

        int [] arr = {1,-1,2,-2,3,-3};

        MoveNegative.moveNegative(arr);

        System.out.println(Arrays.toString(arr));

    }
}


