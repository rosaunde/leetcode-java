package easy;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        if(nums.length == 1 || k == 0){
            return;
        }

        int[] newNums = nums.clone();
        for(int i = 0; i < nums.length; i++){
            int index = i+k;
            index %= nums.length;
            System.out.println(i);
            System.out.println(index);
            nums[index] = newNums[i];
        }
    }
}