package easy;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> matches = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++){
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            if(matches.containsKey(c1) && matches.containsValue(c2)){
                if(matches.get(c1) != c2){
                    return false;
                }
            } else if (matches.containsKey(c1) || matches.containsValue(c2)){
                return false;
            } else{
                matches.put(c1,c2);
            }
        }
        return true;
    }
}