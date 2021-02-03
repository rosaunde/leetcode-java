package hard;

import util.TreeNode;

public class BinaryTreeMaximumPathSum {
    int maxPathSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int maxPath = maxPathSummer(root);
        return Math.max(maxPathSum, maxPath);
    }

    public int maxPathSummer(TreeNode node){
        if(node.left== null && node.right == null){
            return node.val;
        }
        if(node.left != null && node.right != null){
            int leftSum = maxPathSummer(node.left);
            int rightSum = maxPathSummer(node.right);

            int connected = leftSum + rightSum + node.val;

            if(connected > maxPathSum){
                maxPathSum = connected;
            }

            int greaterPath = Math.max(leftSum, rightSum);
            if(greaterPath > maxPathSum){
                maxPathSum = greaterPath;
            }

            return Math.max(node.val,greaterPath+node.val);
        }
        if(node.left != null){
            int leftSum = maxPathSummer(node.left);

            if(leftSum > maxPathSum){
                maxPathSum = leftSum;
            }

            return Math.max(node.val,leftSum+node.val);
        }else {
            int rightSum = maxPathSummer(node.right);

            if(rightSum > maxPathSum){
                maxPathSum = rightSum;
            }

            return Math.max(node.val,rightSum+node.val);
        }


    }
}