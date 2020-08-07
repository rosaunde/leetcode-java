package easy;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> chars = new HashMap<>();
        int i = 0;
        int count = 0;
        int maxCount = 0;
        while (i < s.length()){
            char theChar = s.charAt(i);
            if(chars.get(theChar) != null){
                count = 0;
                i = chars.get(theChar) + 1;
                chars.clear();
                count = 0;
            } else{
                chars.put(theChar, i);
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
                i++;
            }
        }
        return maxCount;
    }
}