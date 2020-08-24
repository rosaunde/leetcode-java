package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    private static Map<Character, String> theMap = theMap();
    public static List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if(digits.length() == 0){
            return results;
        }
        String value = theMap.get(digits.charAt(0));
        for(char letter : value.toCharArray()){
            results.add(String.valueOf(letter));
        }

        for(int i = 1; i < digits.length(); i++){
            String newValue = theMap.get(digits.charAt(i));
            List<String> newResults = new ArrayList<>();
            for(char letter : newValue.toCharArray()){
                for(int j = 0; j < results.size(); j++){
                    newResults.add(results.get(j) + String.valueOf(letter));
                }
            }
            results = newResults;
        }
        return results;
    }

    private static Map<Character, String> theMap(){
        Map<Character, String> theMap = new HashMap<>();
        theMap.put('2', "abc");
        theMap.put('3', "def");
        theMap.put('4', "ghi");
        theMap.put('5', "jkl");
        theMap.put('6', "mno");
        theMap.put('7', "pqrs");
        theMap.put('8', "tuv");
        theMap.put('9', "wxyz");
        return theMap;
    }
}