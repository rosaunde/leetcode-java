package easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        } else if (strs.length == 1){
            return strs[0];
        }
        char[][] arrays = Arrays.stream(strs).map(str -> str.toCharArray()).toArray(char[][]::new);
        String prefix = "";
        for(int i = 0; i < arrays[0].length; i++){
            boolean match = true;
            char letter = arrays[0][i];
            for(int j = 1; j < arrays.length; j++){
                if(arrays[j].length <= i){
                    match = false;
                } else if (arrays[j][i] != letter){
                    match = false;
                }
            }
            if(match == true){
                prefix += letter;
            } else {
                break;
            }
        }
        return prefix;
    }
}