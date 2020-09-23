package easy;

import java.util.HashMap;
import java.util.Map;

public class CloseDuplicateInArray {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> seen = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            if(seen.containsKey(nums[i])){
                if((i - seen.get(nums[i])) <= k){
                    return true;
                } else{
                    seen.put(nums[i], i);
                }
            } else{
                seen.put(nums[i], i);
            }
        }
        return false;
    }
}