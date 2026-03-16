import java.util.*;

class Move{
    public static void moveElementToLast(int[]arr){
        int first = arr[0];

        for(int i=1;i<arr.length;i++){
           arr[i-1]=arr[i];

        }
        arr[arr.length-1]=first;
    }
}
public class MoveFirstElementToLast {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};

        Move.moveElementToLast(arr);

        System.out.println("Result:" +Arrays.toString(arr));
    }
}
