package DSA;

class FindNumber{
    public static int getMissingNumber(int[] arr, int n){
        int expectedSum = n*(n+1)/2;
        int totalSum=0;
        for(int sum :arr){
            totalSum+=sum;
        }
       return expectedSum-totalSum;
    }

}
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = 5;

        int result = FindNumber.getMissingNumber(arr, n);

        System.out.println("Missing number: " + result);
    }
}
