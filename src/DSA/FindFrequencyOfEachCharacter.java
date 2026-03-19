package DSA;

import java.util.*;
import java.util.Map;

public class FindFrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "Debasish";

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
