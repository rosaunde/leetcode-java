package easy;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            boolean passed = false;
            boolean replaced = false;
            for(int j = 0; j < nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    passed = true;
                }
                if(passed && nums2[j] > nums1[i]){
                    result[i] = nums2[j];
                    replaced = true;
                    break;
                }
            }
            if(!replaced){
                result[i] = -1;
            }
        }
        return result;
    }
}