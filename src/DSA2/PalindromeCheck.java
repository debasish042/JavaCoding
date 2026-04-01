package DSA2;

public class PalindromeCheck {
    public static boolean isPalindrome(String str){
        str=str.replaceAll("[^a-zA-z0-9]","").toLowerCase();

        int left =0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="Madam";
        System.out.println(isPalindrome(str));
    }

}
