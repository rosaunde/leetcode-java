package easy;

import java.util.HashMap;
import java.util.Map;

class MajorityElementArray {
    public static int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Map<Integer,Integer> numbersToCounts = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(numbersToCounts.get(val) == null){
                numbersToCounts.put(val, 1);
            } else if (numbersToCounts.get(val) > (nums.length/2) - 1){
                return val;
            } else{
                numbersToCounts.put(val,numbersToCounts.get(val) + 1);
            }
        }
        return 0;
    }
}