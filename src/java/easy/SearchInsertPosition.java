package easy;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1]){
            return nums.length;
        }

        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            if(target>nums[0]){
                return 1;
            }else{
                return 0;
            }
        }

        int l=0;
        int r=nums.length-1;

        while(l<r){
            int m = (l+r)/2;
            if(target>nums[m]){
                l=m+1;
            }else{
                r=m;
            }
        }

        return l;
    }
}