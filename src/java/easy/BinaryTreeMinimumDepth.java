package easy;

import easy.util.TreeNode;

public class BinaryTreeMinimumDepth {
    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        if(root.left == null){
            return 1 + minDepth(root.right);
        }
        if(root.right == null){
            return 1 + minDepth(root.left);
        }

        return Math.min(1+minDepth(root.left), 1+minDepth(root.right));
    }
}