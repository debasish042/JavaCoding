package DSA;

class Once{
    public static int findNumberOnce(int[]arr){
        int result =0;

        for(int num:arr){
            result^=num;
        }
        return result;
    }
}
public class ElementThatAppearsOnce {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,3,4,5};

        System.out.println("Number that appears once is " +Once.findNumberOnce(arr) );
    }


}
