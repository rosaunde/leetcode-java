package easy;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappeared = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[Math.abs(nums[i])-1] > 0){
                nums[Math.abs(nums[i])-1] = nums[Math.abs(nums[i])-1] * -1;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                disappeared.add(i+1);
            }
        }

        return disappeared;
    }
}