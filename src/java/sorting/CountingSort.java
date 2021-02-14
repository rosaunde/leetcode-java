package sorting;

public class CountingSort {

    public static int[] countingSort(int[] nums){
        if(nums.length<2){
            return nums;
        }
        int maxValue = nums[0];
        int minValue = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > maxValue){
                maxValue = nums[i];
            } else if(nums[i] < minValue){
                minValue = nums[i];
            }
        }
        int[] counters = new int[maxValue-minValue+1];
        for(int i = 0; i<nums.length;i++){
            counters[nums[i]-minValue]++;
        }

        for(int i = 1; i<counters.length; i++){
            counters[i] = counters[i-1]+counters[i];
        }

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int numberToPlace = nums[i];
            int indexToPlaceAt = counters[numberToPlace-minValue]-1;
            counters[numberToPlace-minValue]--;
            result[indexToPlaceAt] = numberToPlace;
        }
        return result;
    }
}
