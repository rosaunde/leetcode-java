package easy;

class TwoSumSortedArray {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            int value = numbers[left] + numbers[right];
            if(value  == target){
                return new int[]{left+1,right+1};
            } else if(value > target){
                while(value > target){
                    right--;
                    value = numbers[left] + numbers[right];
                }
            } else {
                while(value < target){
                    left++;
                    value = numbers[left] + numbers[right];
                }
            }
        }
        return null;
    }
}