package medium;

public class FirstAndLastElementInAnArray {
    public static int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        Integer index = binarySearch(nums, target, 0, nums.length -1);
        int[] values = new int[2];
        if(index == null){
            return new int[]{-1,-1};
        } else{
            int leftIndex = index;
            int rightIndex = index;
            while(leftIndex > 0 && nums[leftIndex-1] == target){
                leftIndex--;
            }
            while(rightIndex < nums.length -1 && nums[rightIndex+1] == target){
                rightIndex++;
            }
            return new int[]{leftIndex, rightIndex};
        }
    }

    public static Integer binarySearch(int[] nums, int target, int left, int right){
        System.out.println("Looking between " + left + " and " + right + " for " + target);
        int index = (right + left) / 2;
        System.out.println("Index = " + index);
        int value = nums[index];
        System.out.println("Value at index = " +value);


        if(value == target){
            return index;
        } else if(right <= left){
            return null;
        } else if (target > value){
            return binarySearch(nums, target, index + 1, right);
        } else {
            return binarySearch(nums, target, left, index -1);
        }
    }
}