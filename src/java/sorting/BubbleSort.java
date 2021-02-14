package sorting;

import static util.Swapper.swapInts;

public class BubbleSort {

    public void bubbleSort(int[] nums){
        boolean swapped = true;
        while(swapped){
            swapped =false;
            for(int i = 0; i < nums.length-1; i++){
                int j = i+1;
                if(nums[j] < nums[i]){
                    swapInts(i,j,nums);
                    swapped=true;
                }
            }
        }
    }
}