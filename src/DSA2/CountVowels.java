package DSA2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowels {
    public static int countVowels(String str){

        int count =0;

        Set<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','i','o','u'));

        for(char ch : str.toLowerCase().toCharArray()){
            if(vowels.contains(ch)){
                count++;
            }
        }
        return count;
    }

    public static void main(String [] args){
        String str ="Debasish";

        System.out.println(countVowels(str));
    }
}
