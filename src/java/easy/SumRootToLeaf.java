package easy;

import util.TreeNode;

public class SumRootToLeaf {
    public static boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSum(root, 0, sum);
    }

    public static boolean hasPathSum(TreeNode root, int value, int sum){
        if(root == null){
            return false;
        }
        value += root.val;
        if(value == sum && root.left == null && root.right == null){
            return true;
        }
        return (hasPathSum(root.left, value, sum) || hasPathSum(root.right, value, sum));
    }
}