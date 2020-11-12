package easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }

        Map<Character, String> map = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            Character ch = pattern.charAt(i);
            String word = words[i];
            if(map.get(ch) == null){
                if(map.containsValue(word)){
                    return false;
                }
                map.put(ch, word);
            } else if(!map.get(ch).equals(word)){
                return false;
            }
        }
        return true;
    }
}