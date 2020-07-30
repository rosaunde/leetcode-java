package easy;

import java.util.HashSet;
import java.util.Set;

class SingleNumberInArray {
    public static int singleNumber(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(values.contains(nums[i])){
                values.remove(nums[i]);
            } else{
                values.add(nums[i]);
            }
        }
        return (int) values.toArray()[0];
    }
}