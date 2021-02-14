package sorting;

import static util.Swapper.swapInts;

public class InsertionSort{
    public static void insertionSort(int[] nums){
        if(nums.length < 2){
            return;
        }
        for(int i = 1; i< nums.length; i++){
            int j = i;
            while(j>0 && nums[j] < nums[j-1]){
                swapInts(j,j-1,nums);
                j--;
            }
        }
    }
}