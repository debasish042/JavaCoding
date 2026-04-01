package DSA2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeatingCharacter(String str) {

        Map<Character,Integer> map = new HashMap<>();

        //count frequency
        for (char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        //find first unique
        for(char c :str.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        String str ="Debasish";
        System.out.println(firstNonRepeatingCharacter(str));
    }
}



