package easy;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++){
            if(seen.contains(nums[i])){
                return true;
            } else{
                seen.add(nums[i]);
            }
        }
        return false;
    }
}