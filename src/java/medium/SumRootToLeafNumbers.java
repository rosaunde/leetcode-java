package medium;

import util.TreeNode;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        return sumNumbers(root, 0, 0);
    }

    public int sumNumbers(TreeNode root, int pathValue, int total){
        int newPathValue =  (pathValue*10) + root.val;
        if(root.left == null && root.right == null){
            return total + newPathValue;
        } else {
            int leftValue = 0;
            if(root.left != null){
                leftValue = sumNumbers(root.left, newPathValue, total);
            }
            int rightValue = 0;
            if(root.right != null){
                rightValue = sumNumbers(root.right, newPathValue, total);
            }
            return rightValue+leftValue;
        }
    }
}