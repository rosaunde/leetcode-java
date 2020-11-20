package easy;

import util.TreeNode;

public class BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }

        int leftHeight = getHeight(root.left);
        System.out.println(leftHeight);
        int rightHeight = getHeight(root.right);
        System.out.println(rightHeight);

        if(leftHeight == rightHeight || leftHeight - rightHeight == 1 || leftHeight - rightHeight == -1){
            return isBalanced(root.left) && isBalanced(root.right);
        }

        return false;
    }

    public static int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return Math.max(1+getHeight(root.left), 1+getHeight(root.right));
    }
}