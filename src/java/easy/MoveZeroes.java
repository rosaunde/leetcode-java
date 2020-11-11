package easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                if(i != nonZero){
                    nums[nonZero] = nums[i];
                    nums[i] = 0;
                }
                nonZero++;
            }
        }
    }
}