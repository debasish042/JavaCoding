package DSA2;

public class ReverseAString {
    public static String reverseString(String str){

        char[] arr = str.toCharArray();

        int left =0;
        int right = arr.length-1;

        while(left<right){
            char temp = arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String str ="Debasish";

        System.out.println(reverseString(str));
    }
}
