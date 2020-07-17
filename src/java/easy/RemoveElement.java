package easy;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if(nums.length  == 0){
            return 0;
        }
        if(nums.length == 1){
            if(nums[0] == val){
                return 0;
            }else {
                return 1;
            }
        }

        int index = nums.length - 1;

        for(int j = nums.length-1; j >=0; j--){
            int temp;
            if(nums[j] == val){
                temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;
                index--;
            }
        }
        return index + 1;
    }
}