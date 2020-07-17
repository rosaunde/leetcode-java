package easy;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int maxValueHere = nums[0];
        int maxValue = nums[0];
        for(int i = 1; i < nums.length; i++){
            maxValueHere = Math.max(maxValueHere + nums[i], nums[i]);
            maxValue = Math.max(maxValue, maxValueHere);
        }
        return maxValue;
    }
}