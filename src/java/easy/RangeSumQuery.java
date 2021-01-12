package easy;

public class RangeSumQuery {

    private int[] nums;

    public RangeSumQuery(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for(int index = i; index <=j ; index++){
            sum+=nums[index];
        }
        return sum;
    }
}