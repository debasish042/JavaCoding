import java.util.HashMap;
import java.util.Map;

class FindNonRepeating{
    public static char findCharacter(String str){
        Map<Character,Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c :str.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }
        return '_';
    }
}
public class FirstNonRepeatingCharacterDSA {
    public static void main(String[] args) {
        String str ="Debasish";
        System.out.println("First non repeating character is  "+FindNonRepeating.findCharacter(str));
    }
}
