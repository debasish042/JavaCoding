package DSA;

class LinearSearch{
    public static int GetElementInLinearSearch(int[] arr,int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

public class LinearSearchDSA {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;

        int result=   LinearSearch.GetElementInLinearSearch(arr,target);

        if(result!=-1){
            System.out.println("Element found at index "+result);
        }else{
            System.out.println("Element not found");
        }


    }
}
