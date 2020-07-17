package easy;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }

        boolean done = false;
        int index = 1;
        int searchValue = nums[0] + 1;
        for(int j = 1; j < nums.length; j++){
            int temp = -1;
            if(nums[j] >= searchValue){
                temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;
                searchValue = nums[index]+1;
                index++;
            }
        }
        return index;
    }
}