package DSA2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String [] args){
        String str="Debasish";

        Set<Character> set = new LinkedHashSet<>();

        for(char ch : str.toCharArray()){
            set.add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : set){
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
