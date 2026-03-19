package DSA;

class CheckPalindrome{
    public static boolean isPalindrome(String str){
        String sb = new StringBuilder(str).reverse().toString();
        return sb.equals(str);
    }
}

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(CheckPalindrome.isPalindrome("madam"));
    }
}
