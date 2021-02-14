package sorting;

import static util.Swapper.swapInts;

public class QuickSort {

    public static void quickSort(int[] nums){
        quickSort(0, nums.length-1, nums);
    }

    public static void quickSort(int left, int right, int[] nums){
        if(left>=right){
            return;
        }
        int pivot = right;

        int i = left-1;
        int j = left;
        while(j<right){
            if(nums[j] < nums[pivot]){
                i++;
                swapInts(i,j,nums);
            }
            j++;
        }
        swapInts(i+1, pivot, nums);

        quickSort(left, i, nums);
        quickSort(i+2, right, nums);
    }
}