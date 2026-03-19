package DSA;

class getSecondLargestElement{
    public static int findSecondLargestElement(int []arr){
        if(arr==null || arr.length<2){
            throw new IllegalArgumentException("Less element is present ");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>largest){
                secondLargest = largest;
                largest = num ;
            } else if(num>secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            throw new IllegalArgumentException("Second largest element is not present ");
        }
        return secondLargest;
    }

}

public class SecondLargestDSA2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,};

        int secondHighest = getSecondLargestElement.findSecondLargestElement(arr);
        System.out.println(secondHighest);
    }
}
