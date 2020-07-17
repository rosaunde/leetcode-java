package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> values = new HashMap<Character,Integer>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        int value = 0;
        for(int i = 0; i < chars.length; i++){
            if(i == chars.length - 1){
                value += values.get(chars[i]);
            }else if (values.get(chars[i])>=values.get(chars[i+1])){
                value += values.get(chars[i]);
            } else {
                value -= values.get(chars[i]);
            }
        }
        return value;
    }
}