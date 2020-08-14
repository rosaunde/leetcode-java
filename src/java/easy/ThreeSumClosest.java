package easy;

import java.util.Arrays;

class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                int value = nums[i] + nums[right] + nums[left];
                if(value == target){
                    return value;
                }
                if(Math.abs(target-value) < minDiff){
                    result = value;
                    minDiff = Math.abs(target-value);
                }
                if(value > target){
                    right--;
                }
                if(value < target){
                    left++;
                }
            }
        }
        return result;
    }
}