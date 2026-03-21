package DSA;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength=0;

        for(int i=0;i<s.length();i++){

            HashSet<Character> set=new HashSet<>();

            for(int j=1;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                maxLength=Math.max(maxLength,set.size());
            }
        }
        return maxLength;


    }
}
