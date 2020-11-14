package medium;

import util.TreeNode;

public class ValidBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        return isValidBST(root, null, null);
    }
    public boolean isValidBST(TreeNode root, Integer lessThan, Integer greaterThan) {
        if(root == null){
            return true;
        }

        int value = root.val;

        if(lessThan != null){
            if (value >= lessThan){
                return false;
            }
        }
        if(greaterThan != null){
            if(value <= greaterThan){
                return false;
            }
        }

        return isValidBST(root.left, value, greaterThan) && isValidBST(root.right, lessThan, value);
    }
}