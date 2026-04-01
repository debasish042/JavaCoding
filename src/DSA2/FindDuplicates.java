package DSA2;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        String str ="debasish";

        Map<Character,Integer> map = new HashMap<>();
    //find frequency
        for(char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //find Duplicates

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"->"+entry.getValue());
            }
        }
    }
}
