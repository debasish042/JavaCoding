import java.util.*;
class ReverseString{
    public static String reverseString(String s){

        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(ReverseString.reverseString("abc"));
    }


}
