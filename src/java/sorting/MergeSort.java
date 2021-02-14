package sorting;

public class MergeSort{

    public static void mergeSort(int[] nums){
        mergeSort(0, nums.length-1, nums);
    }

    public static void mergeSort(int left, int right, int[] nums){
        if(left>=right){
            return;
        }
        int middle = left + (right-left)/2;
        mergeSort(left, middle, nums);
        mergeSort(middle+1, right, nums);
        merge(left, middle, right, nums);
    }

    private static void merge(int left, int middle, int right, int[] nums){
        int[] leftNums = new int[middle-left+1];
        int[] rightNums = new int[right-middle];

        for(int i = 0; i < leftNums.length; i++){
            leftNums[i] = nums[left+i];
        }

        for(int i = 0; i < rightNums.length; i++){
            rightNums[i] = nums[middle+1+i];
        }

        int leftI = 0;
        int rightI = 0;
        int index = left;
        while(leftI < leftNums.length && rightI < rightNums.length){
            if(leftNums[leftI] <= rightNums[rightI]){
                nums[index] = leftNums[leftI];
                leftI++;
            } else{
                nums[index] = rightNums[rightI];
                rightI++;
            }
            index++;
        }

        while(leftI < leftNums.length){
            nums[index] = leftNums[leftI];
            leftI++;
            index++;
        }

        while(rightI < rightNums.length){
            nums[index] = rightNums[rightI];
            rightI++;
            index++;
        }
    }
}