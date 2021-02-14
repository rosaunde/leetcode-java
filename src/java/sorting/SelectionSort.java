package sorting;

import static util.Swapper.swapInts;

public class SelectionSort{
    public static void selectionSort(int[] nums){
        if(nums.length <=1){
            return;
        }
        for(int i = 0; i < nums.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j<nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            if(i!=minIndex) {
                swapInts(i,minIndex, nums);
            }
        }
    }
}