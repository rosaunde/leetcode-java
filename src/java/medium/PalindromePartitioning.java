package medium;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        if(s.length() == 0 || s == null){
            return null;
        }
        List<List<String>> results = new ArrayList<>();
        if(s.length() == 1){
            List<String> result = new ArrayList<>();
            result.add(s);
            results.add(result);
            return results;
        }

        for(int i = 0; i < s.length(); i++){
            String drome = s.substring(0,i+1);
            if(isPalindrome(drome)){
                if(drome.length() == s.length()){
                    List<String> result = new ArrayList<>();
                    result.add(drome);
                    results.add(result);
                } else {
                    List<List<String>> partitionedRest = partition(s.substring(i+1, s.length()));
                    if(partitionedRest != null && partitionedRest.size() > 0){
                        partitionedRest.forEach(list -> list.add(0, drome));
                        results.addAll(partitionedRest);
                    }
                }

            }
        }

        return results;
    }

    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() -1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}