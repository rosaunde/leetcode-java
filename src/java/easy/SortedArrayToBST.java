package easy;

import easy.util.TreeNode;

import java.util.Arrays;

public class SortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        } else if (nums.length == 1){
            return new TreeNode(nums[0]);
        } else if(nums.length == 2){
            TreeNode node = new TreeNode(nums[1]);
            if(nums[0] < nums[1]){
                node.left = new TreeNode(nums[0]);
            }else{
                node.right = new TreeNode(nums[0]);
            }
            return node;
        }

        int mid = nums.length/2;
        TreeNode rootNode = new TreeNode(nums[mid]);
        rootNode.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        rootNode.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid+1, nums.length));
        return rootNode;
    }
}