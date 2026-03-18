import java.util.HashMap;
import java.util.Map;

public class AnagramDSA {
    public static boolean isAnagram(String a, String b) {
        if(a.length() !=b.length()) return false;

        a= a.replaceAll("\\s","").toLowerCase();
        b=b.replaceAll("\\s","").toLowerCase();

       Map<Character,Integer> map =new HashMap<>();

       for(char c :a.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
       }

       for(char c :b.toCharArray()){
           if(!map.containsKey(c)) return false;
           map.put(c,map.get(c)-1);
           if(map.get(c) == 0){
               map.remove(c);
           }
       }
       return map.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("raja","Jara"));
    }

}
